package internal

import com.kms.katalon.core.configuration.RunConfiguration
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase

/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */
public class GlobalVariable {
     
    /**
     * <p></p>
     */
    public static Object qaURL
     
    /**
     * <p></p>
     */
    public static Object devURL
     
    /**
     * <p></p>
     */
    public static Object username
     
    /**
     * <p>Profile default : Pass for qa enviroment</p>
     */
    public static Object password
     
    /**
     * <p></p>
     */
    public static Object encryptedPassword
     
    /**
     * <p></p>
     */
    public static Object elementTimeout
     

    static {
        def allVariables = [:]        
        allVariables.put('default', ['qaURL' : 'https://qa.valuevision.com/Account/Login/', 'devURL' : 'dev.valuevision.com', 'username' : 'armita.azari', 'password' : 'Passw0rd1', 'encryptedPassword' : 'P22/mDurbpKyiHjASiOuog==', 'elementTimeout' : 30])
        
        String profileName = RunConfiguration.getExecutionProfile()
        
        def selectedVariables = allVariables[profileName]
        qaURL = selectedVariables['qaURL']
        devURL = selectedVariables['devURL']
        username = selectedVariables['username']
        password = selectedVariables['password']
        encryptedPassword = selectedVariables['encryptedPassword']
        elementTimeout = selectedVariables['elementTimeout']
        
    }
}
