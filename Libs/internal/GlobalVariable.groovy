package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.main.TestCaseMain


/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object urlOrangeHrm
     
    /**
     * <p></p>
     */
    public static Object usernameValidLogin
     
    /**
     * <p></p>
     */
    public static Object passwordValidLogin
     
    /**
     * <p></p>
     */
    public static Object urlCuraHealthcare
     
    /**
     * <p></p>
     */
    public static Object usernameCura
     
    /**
     * <p></p>
     */
    public static Object passwordCura
     
    /**
     * <p></p>
     */
    public static Object baseUrl
     
    /**
     * <p></p>
     */
    public static Object Username
     
    /**
     * <p></p>
     */
    public static Object Password
     

    static {
        try {
            def selectedVariables = TestCaseMain.getGlobalVariables("default")
			selectedVariables += TestCaseMain.getGlobalVariables(RunConfiguration.getExecutionProfile())
            selectedVariables += TestCaseMain.getParsedValues(RunConfiguration.getOverridingParameters(), selectedVariables)
    
            urlOrangeHrm = selectedVariables['urlOrangeHrm']
            usernameValidLogin = selectedVariables['usernameValidLogin']
            passwordValidLogin = selectedVariables['passwordValidLogin']
            urlCuraHealthcare = selectedVariables['urlCuraHealthcare']
            usernameCura = selectedVariables['usernameCura']
            passwordCura = selectedVariables['passwordCura']
            baseUrl = selectedVariables['baseUrl']
            Username = selectedVariables['Username']
            Password = selectedVariables['Password']
            
        } catch (Exception e) {
            TestCaseMain.logGlobalVariableError(e)
        }
    }
}
