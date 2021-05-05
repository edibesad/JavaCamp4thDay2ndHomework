package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisServiceReference.ALKKPSPublicSoap;


import java.rmi.RemoteException;


public class MernisServiceAdapter implements CustomerCheckService
{

    @Override
    public boolean ChecIfRealPerson(Customer customer) throws Exception
    {
        ALKKPSPublicSoap client = new ALKKPSPublicSoap();
        return client.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()), customer.getFirstName(), customer.getLastName(), customer.getYearOfBirth());
    }
}
