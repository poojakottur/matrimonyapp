import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { LoginComponent } from './login/login.component';
import { HomeComponent } from './home/home.component';
import { HeaderComponent } from './header/header.component';
import { ContactComponent } from './contact/contact.component';
import { AboutusComponent } from './aboutus/aboutus.component';
import { AdminloginComponent } from './adminlogin/adminlogin.component';
import { RegisterComponent } from './register/register.component';
import { CustomerdetailsComponent } from './customerdetails/customerdetails.component';
const routes: Routes = [
  {path:"",redirectTo:"home",pathMatch:"full"},
{path:"home",component:HomeComponent},
{path:"aboutus",component:AboutusComponent},
{ path:"login",component:LoginComponent},
{path:"contact",component:ContactComponent},
{path:"header",component:HeaderComponent},
{path:"adminlogin",component:AdminloginComponent},
{path:"register",component:RegisterComponent},
{path:"customerdatails",component:CustomerdetailsComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
