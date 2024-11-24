package com.shubham.adapter;

public class HumanWeighingMachineAdapter implements WeightMachineAdapter {

    private WeighingMachine weighingMachine;

    public HumanWeighingMachineAdapter(WeighingMachine weighingMachine) {
        this.weighingMachine = weighingMachine;
    }



    @Override
    public int getWeightInKg() {
        return weighingMachine.getWeightInPounds() * 5;
    }
}
