package com.demo.report;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ReportTitle {

	public static String mailTitle = "";

	@Test
	@Parameters({"title"})
	public void titleSetTing(String title) {
		// 测试邮件报告标题处理
		if (title.contains("(")) {
			title = title.split("\\(")[0].trim();
		}
		mailTitle = title;
	}
}
