import {CustomerType} from './customer-type';

export class Customer {
  id: number;
  customerType: CustomerType;
  name: string;
  birthDate: string;
  gender: string;
  idCard: string;
  phone: string;
  email: string;
  address: string;
  constructor(id: number, nameCustomerType: CustomerType, name: string, birthDate: string,
              gender:string, idCard: string, phone: string, email: string, address: string) {
    this.id = id;
    this.customerType = nameCustomerType;
    this.birthDate = birthDate;
    this.gender=gender;
    this.idCard = idCard;
    this.phone = phone;
    this.email = email;
    this.address = address;
  }
}
