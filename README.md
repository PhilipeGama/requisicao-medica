# ProntuarioEletronico
```
Autores: Elias,Philipe e Thiago 
Disciplina: MC-DESENVOLVIMENTO DE APLICAÇÕES DISTRIBUÍDAS
Data: 2020.2
Tecnologias: RMI, API REST.
```


```
Formem grupos de 3 ou 4 pessoas e desenvolvam duas aplicações:
- Aplicação do consultório médico: Uma API REST que faça o cadastro de um prontuário eletrônico com as seguintes informações: numero do prontuário, nome do paciente, CPF do paciente, nome do médico, CRM do médico, avaliação e tratamento. Esta aplicação deverá ter um cliente RMI para obter uma lista de exames deste paciente e os resultados, fornecido o CPF do mesmo e o número do prontuário. Esta lista de exames deverá ser enviada juntamente com o prontuário.

- Aplicação do laboratório: Uma aplicação Java que implemente um servidor RMI, o qual irá enviar uma lista de exames com seus resultados e valores esperados, dados o CPF do paciente e o número do prontuário.


Dicas:
- a aplicação RMI do lado servidor (laboratório) poderá ser implementada usando um método que retorne uma classe  ResquisicaoExame.
- a classe RequisicaoExame terá como atributos o número do prontuário, o CPF do paciente e uma List<Exame> (aqui, uma agregação).
- a classe Exame terá como atributos nome do exame, resultado e valores esperados
- o laboratório não precisará de um sistema de cadastro. Basta que envie alguns exames pré-definidos.
- a classe Exame deverá implementar a interface Serializable. Permitindo que a mesma possa ser enviada através do protocolo RMI.
- a classe Prontuário deverá ter um atributo que represente a requisição de exames. Neste caso, este atributo terá a notação @Transient
