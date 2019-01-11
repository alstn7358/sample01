package chap04;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

public class Main4 {
	
	public static void main(String[] args){
		ApplicationContext ctx = new GenericXmlApplicationContext("classpath:chap04/appCtx4.xml");
		MemberRegisterService regSvc = ctx.getBean("memberRegSvc", MemberRegisterService.class);
		MemberInfoPrinter infoPrinter = ctx.getBean("infoPrinter", MemberInfoPrinter.class);
/*		RegisterRequest regReq = new RegisterRequest();
		regReq.setEmail("madvirus@madivirus.net");
		regReq.setName("�ֹ���");
		regReq.setPassword("1234");
		regReq.setConfirmPassword("1234");
		regSvc.regist(regReq);
		infoPrinter.printMemberInfo("madvirus@madvirus.net");*/
	}
}

