import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-add-user',
  templateUrl: './add-user.component.html',
  styleUrls: ['./add-user.component.css']
})
export class AddUserComponent implements OnInit {

  us:any=new User()

  constructor(private service:UserService,private rout:Router) { }

  ngOnInit(): void {
  }

  onSubmit(){
    this.saveUser();
    this.goToAllUser()
  }

  goToAllUser(){
    this.rout.navigate(['/all'])
  }

  saveUser(){
    this.service.saveUser(this.us).subscribe(data=>{
      console.log(data)
    })
  }
}
