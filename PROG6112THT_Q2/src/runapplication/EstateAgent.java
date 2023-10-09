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
public abstract class EstateAgent implements iEstateAgent{
     private String agentName;
     private double propertyPrice;
     private double agentCommission;
    public EstateAgent(String agent_Name,double property_Price){
       this.agentName=agent_Name;
       this.propertyPrice=property_Price;
    }
}
