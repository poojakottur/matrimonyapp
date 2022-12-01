import { Component, OnInit } from '@angular/core';
import { CustomerService } from '../customer.service';
import { Customer } from '../customer';
import { Router } from '@angular/router';

@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {


customer:Customer=new Customer();
  constructor(private customerService : CustomerService,
  private router: Router ){ }

  ngOnInit(): void {
  }

  saveCustomer(){
    this.customerService.createCustomer(this.customer).subscribe(data =>{
      console.log(data);
      this.goToCustomerList();
    },
    error => console.log(error));

  }
    
      goToCustomerList(){
         this.router.navigate([`/customers`]);
      }

  

onRegister(){
console.log(this.customer);
this.saveCustomer();
}
signIn(){
  this.router.navigate(['login'])
}
}

