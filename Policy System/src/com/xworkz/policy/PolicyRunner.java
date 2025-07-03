package com.xworkz.policy;

import com.xworkz.policy.governmentpolicy.*;

public class PolicyRunner {
    public static void main(String[] args) {
        GovernmentPolicyRules g1 = new KarnatakaGovernment();
        g1.unionBudget();
        g1.applyGSTRates();
        g1.monitorChildLabor();
        g1.nspScholarship();
        g1.pradhanMantriJanDhanYojana();
        g1.swachhBharat();
        g1.enforceRightToEducation();
        g1.distributeSubsidies();
        g1.processAadhaarVerification();

        GovernmentPolicyRules g2 = new KarnatakaGovernment();
        g2.subhadraYojana();

        GovernmentPolicyRules g3 = new KarnatakaGovernment();
        g3.agricultureInfrastructureFund();
        g3.gramSwarajAbhiyan();
        g3.svamithaYojana();

        GovernmentPolicyRules g4 = new KarnatakaGovernment();
        g4.arogyaBhagyaYojana();
        g4.trafficManagement();
        g4.policeModernizationScheme();


    }
}