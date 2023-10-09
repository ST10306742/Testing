/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runapplication;

/**
 *
 * @author shail
 */
public class EstateAgentSales extends EstateAgent{
    String name;
    double propPrice,agentCom;
    public EstateAgentSales(String agent_Name,double property_Price){
        super(agent_Name, property_Price);
        this.name=agent_Name;
        this.propPrice=property_Price;
        this.agentCom=(property_Price/100)*20;//calculating commission
    }
    //overriding get methods
    @Override
    public String getAgentName() {
       return name;
    }

    @Override
    public double getPropertyPrice() {
        return propPrice;
    }

    @Override
    public double getAgentCommission() {
        return agentCom;
    }
    
    public void printPropertyReport(){//prinitng details
        System.out.println("ESTATE AGENT REPORT\n"+
                           "*******************\n"+
                           "ESTATE AGENT NAME: "+getAgentName()+
                           "\nPROPERTY PRICE: "+getPropertyPrice()+
                           "\nAGENT COMMISSION: "+getAgentCommission());
    }
}
