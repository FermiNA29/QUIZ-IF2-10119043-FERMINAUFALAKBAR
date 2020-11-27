/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quiz.if2.pkg10119043.ferminaufalakbar;

/**
 *
 * @author FERMI
 */
public class ServicePrice implements ServiceItem{
    private float priceService;
    private float discount;

    public float getPriceService() {
        return priceService;
    }

    public void setPriceService(float priceService) {
        this.priceService = priceService;
    }
    
    @Override
    public void displayService() {
        System.out.println("#*************************#\n" +
            "#***Rock n Roll Haircut***#\n" +
            "#*******Service List******#\n" +
            "1. Haircut : IDR 45K\n" +
            "2. Haircut + Hairwash: IDR 55K\n" +
            "3. Hairwash Only : IDR 15K\n" +
            "#*************************#\n");
    }

    @Override
    public float getPrice(int serviceItem) {
        switch (serviceItem) {
            case 1:
                setPriceService(45000);
                break;
            case 2:
                setPriceService(55000);
                break;
            case 3:
                setPriceService(15000);
                break;
            default:
                setPriceService(0);
                break;
        }
        return getPriceService();
    }

    @Override
    public boolean checkMemberStatus(String statusMember) {
        if ("yes".equals(statusMember)) {
            return true;
        } else {
            return false;
        }
    }

    @Override
    public float getSale(boolean isMember, float parServicePrice) {
        if(isMember) {
            parServicePrice = (parServicePrice * 10)/100;
        } else {
            parServicePrice = parServicePrice;
        }
        return parServicePrice;
    }
    
}
