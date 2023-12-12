package testng.testrunner;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentReport {

    public static ExtentReports getReportObject() {
        String path = System.getProperty("user.dir") + "\\reports\\index.html";
        System.out.println(path);
        ExtentSparkReporter reporter = new ExtentSparkReporter(path);
        reporter.config().setReportName("Calculator Automation Test Results");
        reporter.config().setDocumentTitle("Test Automation");

        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "ExtentReport");
        return extent;
    }
}