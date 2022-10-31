#language: es
@login
Característica: Funcionalidad de login
  @loginsatisfactorio
  Esquema del escenario: Check login es satisfactorio con credenciales validas
    Dado navegador es abierto
    Cuando usuario realiza login en la pagina
    Entonces usuario ingresa "<username>" y "<password>"
    Y usuario realiza click en login
    #* usuario esta navegando por la plataforma
    Ejemplos:
      | username                    | password    |  |
      | cramos+devinvertir12@prestamype.com | 781783cerhC |  |
#      | cramos+tstmasivo01@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo02@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo03@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo04@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo05@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo06@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo07@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo08@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo09@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo10@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo11@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo12@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo13@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo14@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo15@prestamype.com  | 781783cerhC |  |
#      | cramos+tstmasivo16@prestamype.com  | 781783cerhC |  |
   #   | cramos+devinvertir08@prestamype.com | 781783cerhC |  |



  @correoincorrecto
  Esquema del escenario: Correo incorrecto en las credenciales
    Dado navegador es abierto
    Cuando usuario realiza login en la pagina
    Entonces usuario ingresa el correo incorrecto "<username>" y "<password>"

    Ejemplos:
      | username                   | password    |  |
      | cramostestinv12yopmail.com | 781783cerhC |  |


  @passwordincorrecto
  Esquema del escenario: password incorrecto en las credenciales
    Dado navegador es abierto
    Cuando usuario realiza login en la pagina
    Entonces usuario ingresa el password incorrecto "<username>" y "<password>"

    Ejemplos:
      | username                    | password   |  |
      | cramostestinv12@yopmail.com | 781783cerh |  |

  @correoincorrectopasswordincorrecto
      #falta validar

  Esquema del escenario: password incorrecto y correo incorrecto en las credenciales
    Dado navegador es abierto
    Cuando usuario realiza login en la pagina
    Entonces usuario ingresa el password incorrecto, password inccorrecto "<username>" y "<password>"

    Ejemplos:
      | username                | password   |  |
      | cramostestinv12@yopmail | 781783cerh |  |

#  @reenviarcorreo
#  Esquema del escenario: reenviar correo
#    Dado navegador es abierto
#    Cuando usuario realiza login en la pagina
#    Entonces usuario ingresa "<username>" y "<password>"
#    Y usuario realiza click en login
#    * realizar link reenviar
#
#    Ejemplos:
#      | username                       | password    |  |
#      | cramos+tstinv61@prestamype.com | 781783cerhC |  |


