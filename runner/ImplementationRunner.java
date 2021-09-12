package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

//@CucumberOptions(features="src/test/java/features/LeaftapCreateLead.feature", glue="leaftapsSteps", publish=true)
//@CucumberOptions(features={"src/test/java/features/LeaftapLogin.feature","src/test/java/features/LeaftapCreateLead.feature"}, glue="leaftapsSteps", publish=true)
//@CucumberOptions(features={"src/test/java/features/LeaftapCreateLead.feature","src/test/java/features/LeaftapEditLead.feature","src/test/java/features/LeaftapDeleteLead.feature"}, glue="leaftapsSteps", publish=true)
//@CucumberOptions(features={"src/test/java/features/LeaftapDuplicateLead.feature","src/test/java/features/LeaftapMergeLead.feature"}, glue="leaftapsSteps", publish=true)

@CucumberOptions(features={"src/test/java/features/LeaftapCreateLead.feature","src/test/java/features/LeaftapEditLead.feature","src/test/java/features/LeaftapDeleteLead.feature","src/test/java/features/LeaftapDuplicateLead.feature","src/test/java/features/LeaftapMergeLead.feature"}, glue="leaftapsSteps", publish=true)
public class ImplementationRunner extends AbstractTestNGCucumberTests{

}
