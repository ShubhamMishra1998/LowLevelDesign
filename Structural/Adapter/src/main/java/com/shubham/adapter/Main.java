package com.shubham.adapter;

public class Main {
    public static void main(String[] args) {
        WeightMachineAdapter weightMachineAdapter = new HumanWeighingMachineAdapter(new HumanWeighingMachine());
        System.out.println(weightMachineAdapter.getWeightInKg());
    }
}
