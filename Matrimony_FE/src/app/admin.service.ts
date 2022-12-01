import { Injectable } from '@angular/core';

import { HttpClient } from '@angular/common/http';



import { Observable } from 'rxjs';

import { Admin } from './admin';



@Injectable({

  providedIn: 'root'

})

export class AdminService {



  private baseUrl="http://localhost:8080/api/v1/getadmin";



  constructor(private httpClient:HttpClient) { }
  getAdminList():Observable<Admin[]>{

   return this.httpClient.get<Admin[]>(`${this.baseUrl}`);

 }

 

 }