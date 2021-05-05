package Abstract;

import Entities.Customer;

public interface CustomerCheckService
{
    boolean ChecIfRealPerson(Customer customer) throws Exception;
}
