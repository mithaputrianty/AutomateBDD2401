import com.kms.katalon.core.annotation.AfterTestCase
import com.kms.katalon.core.annotation.BeforeTestCase
import com.kms.katalon.core.context.TestCaseContext
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW

class NewTestListener {
    @BeforeTestCase
    def beforeTestCase(TestCaseContext testCaseContext) {
        CucumberKW.GLUE = ['orangeHrmPackage', 'curaPackage']
    }
}