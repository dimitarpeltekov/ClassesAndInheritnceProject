package glacialExpedition.models.explorers;

import glacialExpedition.common.ExceptionMessages;
import glacialExpedition.models.suitcases.Carton;
import glacialExpedition.models.suitcases.Suitcase;

public abstract class  BaseExplorer implements Explorer{
    private String name;
    private double energy;
    private Suitcase suitcase ;


    protected BaseExplorer(String name,double energy) {
    this.setName(name);
    this.setEnergy(energy);
    this.suitcase = new Carton();
    }

    @Override
    public void search(){
        if(this.energy<=15){
            this.energy = 0;
        }else{
            this.energy-=15;
        }
    }

    public boolean canSearch(){
        return energy>0;
    }


    @Override
    public String getName() {
        if(name==null||name.trim().isEmpty()){
            throw new NullPointerException(ExceptionMessages.EXPLORER_NAME_NULL_OR_EMPTY);
        }
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public double getEnergy() {
        return energy;
    }

    public void setEnergy(double energy) {
        if(energy<0){
            throw new IllegalArgumentException(ExceptionMessages.EXPLORER_ENERGY_LESS_THAN_ZERO);
        }
        this.energy = energy;
    }

    @Override
    public Suitcase getSuitcase() {
        return suitcase;
    }

    public void setSuitcase(Suitcase suitcase) {
        this.suitcase = suitcase;
    }




}
