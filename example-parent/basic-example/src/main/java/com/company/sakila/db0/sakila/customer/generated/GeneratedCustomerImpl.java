package com.company.sakila.db0.sakila.customer.generated;

import com.company.sakila.db0.sakila.address.Address;
import com.company.sakila.db0.sakila.customer.Customer;
import com.company.sakila.db0.sakila.store.Store;
import com.speedment.common.annotation.GeneratedCode;
import com.speedment.runtime.core.manager.Manager;
import com.speedment.runtime.core.util.OptionalUtil;
import java.sql.Timestamp;
import java.util.Objects;
import java.util.Optional;
import java.util.StringJoiner;

/**
 * The generated base implementation of the {@link
 * com.company.sakila.db0.sakila.customer.Customer}-interface.
 * <p>
 * This file has been automatically generated by Speedment. Any changes made to
 * it will be overwritten.
 * 
 * @author Speedment
 */
@GeneratedCode("Speedment")
public abstract class GeneratedCustomerImpl implements Customer {
    
    private int customerId;
    private short storeId;
    private String firstName;
    private String lastName;
    private String email;
    private int addressId;
    private int active;
    private Timestamp createDate;
    private Timestamp lastUpdate;
    
    protected GeneratedCustomerImpl() {
        
    }
    
    @Override
    public int getCustomerId() {
        return customerId;
    }
    
    @Override
    public short getStoreId() {
        return storeId;
    }
    
    @Override
    public String getFirstName() {
        return firstName;
    }
    
    @Override
    public String getLastName() {
        return lastName;
    }
    
    @Override
    public Optional<String> getEmail() {
        return Optional.ofNullable(email);
    }
    
    @Override
    public int getAddressId() {
        return addressId;
    }
    
    @Override
    public int getActive() {
        return active;
    }
    
    @Override
    public Timestamp getCreateDate() {
        return createDate;
    }
    
    @Override
    public Timestamp getLastUpdate() {
        return lastUpdate;
    }
    
    @Override
    public Customer setCustomerId(int customerId) {
        this.customerId = customerId;
        return this;
    }
    
    @Override
    public Customer setStoreId(short storeId) {
        this.storeId = storeId;
        return this;
    }
    
    @Override
    public Customer setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    
    @Override
    public Customer setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    
    @Override
    public Customer setEmail(String email) {
        this.email = email;
        return this;
    }
    
    @Override
    public Customer setAddressId(int addressId) {
        this.addressId = addressId;
        return this;
    }
    
    @Override
    public Customer setActive(int active) {
        this.active = active;
        return this;
    }
    
    @Override
    public Customer setCreateDate(Timestamp createDate) {
        this.createDate = createDate;
        return this;
    }
    
    @Override
    public Customer setLastUpdate(Timestamp lastUpdate) {
        this.lastUpdate = lastUpdate;
        return this;
    }
    
    @Override
    public Store findStoreId(Manager<Store> foreignManager) {
        return foreignManager.stream().filter(Store.STORE_ID.equal(getStoreId())).findAny().orElse(null);
    }
    
    @Override
    public Address findAddressId(Manager<Address> foreignManager) {
        return foreignManager.stream().filter(Address.ADDRESS_ID.equal(getAddressId())).findAny().orElse(null);
    }
    
    @Override
    public String toString() {
        final StringJoiner sj = new StringJoiner(", ", "{ ", " }");
        sj.add("customerId = " + Objects.toString(getCustomerId()));
        sj.add("storeId = "    + Objects.toString(getStoreId()));
        sj.add("firstName = "  + Objects.toString(getFirstName()));
        sj.add("lastName = "   + Objects.toString(getLastName()));
        sj.add("email = "      + Objects.toString(OptionalUtil.unwrap(getEmail())));
        sj.add("addressId = "  + Objects.toString(getAddressId()));
        sj.add("active = "     + Objects.toString(getActive()));
        sj.add("createDate = " + Objects.toString(getCreateDate()));
        sj.add("lastUpdate = " + Objects.toString(getLastUpdate()));
        return "CustomerImpl " + sj.toString();
    }
    
    @Override
    public boolean equals(Object that) {
        if (this == that) { return true; }
        if (!(that instanceof Customer)) { return false; }
        final Customer thatCustomer = (Customer)that;
        if (this.getCustomerId() != thatCustomer.getCustomerId()) {return false; }
        if (this.getStoreId() != thatCustomer.getStoreId()) {return false; }
        if (!Objects.equals(this.getFirstName(), thatCustomer.getFirstName())) {return false; }
        if (!Objects.equals(this.getLastName(), thatCustomer.getLastName())) {return false; }
        if (!Objects.equals(this.getEmail(), thatCustomer.getEmail())) {return false; }
        if (this.getAddressId() != thatCustomer.getAddressId()) {return false; }
        if (this.getActive() != thatCustomer.getActive()) {return false; }
        if (!Objects.equals(this.getCreateDate(), thatCustomer.getCreateDate())) {return false; }
        if (!Objects.equals(this.getLastUpdate(), thatCustomer.getLastUpdate())) {return false; }
        return true;
    }
    
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 31 * hash + Integer.hashCode(getCustomerId());
        hash = 31 * hash + Short.hashCode(getStoreId());
        hash = 31 * hash + Objects.hashCode(getFirstName());
        hash = 31 * hash + Objects.hashCode(getLastName());
        hash = 31 * hash + Objects.hashCode(getEmail());
        hash = 31 * hash + Integer.hashCode(getAddressId());
        hash = 31 * hash + Integer.hashCode(getActive());
        hash = 31 * hash + Objects.hashCode(getCreateDate());
        hash = 31 * hash + Objects.hashCode(getLastUpdate());
        return hash;
    }
}