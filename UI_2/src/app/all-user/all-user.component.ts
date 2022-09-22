import { Component, OnInit } from '@angular/core';
import { User } from '../user';
import { UserService } from '../user.service';

@Component({
  selector: 'app-all-user',
  templateUrl: './all-user.component.html',
  styleUrls: ['./all-user.component.css']
})
export class AllUserComponent implements OnInit {

  u:any

  constructor(private service:UserService) { }

  ngOnInit(): void {
    this.getAllUser()
  }

  getAllUser(){
    this.service.getAllUser().subscribe(data=>{
      this.u=data;
    })
  }
}
