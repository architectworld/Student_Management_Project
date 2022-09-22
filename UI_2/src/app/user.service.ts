import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from './user';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  private baseUrl="http://localhost:9899/user";

  constructor(private http:HttpClient) { }

getAllUser():Observable<User[]>{

  return this.http.get<User[]>(`${this.baseUrl}/all`);
}

saveUser(us:User):Observable<Object>{
  return this.http.post<Object>(`${this.baseUrl}/insert`,us);
}

}
