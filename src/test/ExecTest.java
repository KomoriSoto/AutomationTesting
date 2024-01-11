package test;

import static com.codeborne.selenide.Condition.*;

import org.junit.Test;

import com.codeborne.selenide.Selenide;

public class ExecTest {

	@Test
	public void executeTest() {
		// test.jspにアクセス
	    Selenide.open("http://localhost:8080/AutomationTesting/test/test.jsp");
	    // Hello Worldという内容が書かれているかチェック
	    Selenide.$(".test").shouldHave(text("Hello World"));
	}
}
