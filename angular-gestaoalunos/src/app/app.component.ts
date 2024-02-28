import { HttpClient } from '@angular/common/http';
import { Component, OnInit } from '@angular/core';
import { Aluno } from './aluno';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrl: './app.component.css'
})
export class AppComponent implements OnInit {

  listaAlunos: Aluno[] = [];
  constructor(private httpClient: HttpClient) {

  }
  ngOnInit(): void {
      this.httpClient.get<Aluno[]>("http://localhost:8080/alunos")
        .subscribe({
          next: resposta => this.listaAlunos = resposta
        })
  }
}
