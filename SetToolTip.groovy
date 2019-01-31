// POC to see if Jira Drop Down list can have tool tip or some info texts
// Thnx to AdaptaVista ScriptRunner suppport!
//
// This shows description only in Edit / Create screens when value of drop down list
// is changed

package com.onresolve.jira.groovy.doit5  // this script must be living under this tree starting from /scripts directory (<jira place>/scripts/com/onresolve/jira/groovy/doit5)
import com.atlassian.jira.component.ComponentAccessor
import org.apache.log4j.Logger
import org.apache.log4j.Level
import com.atlassian.jira.issue.Issue
import com.atlassian.jira.issue.MutableIssue
import com.onresolve.jira.groovy.user.FieldBehaviours   // class to be used if script in server
import com.atlassian.jira.issue.IssueManager
import static com.atlassian.jira.issue.IssueFieldConstants.*  // can use things like AFFECTED_VERSIONS see: https://docs.atlassian.com/software/jira/docs/api/7.6.1/constant-values.html#com.atlassian.jira.issue.IssueFieldConstants.FIX_FOR_VERSIONS
import com.atlassian.jira.ComponentManager

public class SetToolTip extends FieldBehaviours {


	
	
void doit5() {	// just a method runtime system is calling (used in Behaviours configurations)
	
	//**************** CONFIGURATIONS ****************************
    // none 
	//	 
		 
	 // ***************** END OF CONFIGURATIONS ****************************
	
	
		def log = Logger.getLogger("ToolTipper")
		log.setLevel(Level.DEBUG) // DEBUG INFO
	
		log.debug("---------- ToolTipper started ---------------------------------------")
		
		// Get a pointer to my select list custom field
		def RiskListField = getFieldByName("Risk Number2")
		// Get the value from the select list field
		def RiskListFieldVal = RiskListField.getValue().toString()

		// if option A is selected set B description
		if(RiskListFieldVal.toString() == "1"){
			def description = "<b>This is a description for option 1</b>"
			RiskListField.setDescription(description)
			log.debug("1")
		}else if(RiskListFieldVal.toString() == "2"){
			def description = "<b>This is a description for option 2</b>"
			RiskListField.setDescription(description)
			log.debug("2")
}
		else if(RiskListFieldVal.toString() == "3"){
			def description = "<b>This is a description for option 3</b>"
			RiskListField.setDescription(description)
			log.debug("3")
}
		else if(RiskListFieldVal.toString() == "4"){
			def description = "<b>This is a description for option 4</b>"
			RiskListField.setDescription(description)
			log.debug("4")
}
		else if(RiskListFieldVal.toString() == "5"){
			def description = "<b>This is a description for option 5</b>"
			RiskListField.setDescription(description)
			log.debug("5")
}
		log.debug("---------- ToolTipper stopped ---------------------------------------")
	}
}