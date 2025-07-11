package com.mycompany.autopolicy;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Oli
 */

public class AutoPolicyTest
{

    public static void main(String[] args) {
        AutoPolicy policy1 = new AutoPolicy(11111111, "Toyota Camry", "NJ");
        AutoPolicy policy2 = new AutoPolicy(22222222, "Ford Fusion", "ME");

        policyInNoFaultState(policy1);
        policyInNoFaultState(policy2);
    }

    public static void policyInNoFaultState(AutoPolicy policy) {
        System.out.printf("The auto policy:%nAccount #: %d; Car: %s; State: %s%n",
                policy.getAccountNumber(),
                policy.getMakeAndModel(),
                policy.getState());

        if (policy.isNoFaultState()) {
            System.out.println("State is a no-fault state.\n");
        } else {
            System.out.println("State is NOT a no-fault state.\n");
        }
    }

}