package chap04;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class MemberInfoPrinter {
	
	@Autowired
	private MemberDao memDao;
	private MemberPrinter printer;
	@Autowired
	public void setMemberDao (MemberDao memberDao){
		this.memDao = memberDao;
	}
	
	@Resource(name="printer1")
	//@Qualifier("sysout")
	public void setPrinter (MemberPrinter printer){
		this.printer = printer;
	}
	
	public void printMemberInfo (String email){
		Member member = memDao.selectByEmail(email);
		if(member == null){
			System.out.println("데이터 없음\n");
			return;
		}
		printer.print(member);
		System.out.println();
	}

}
