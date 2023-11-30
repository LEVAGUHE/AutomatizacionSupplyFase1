# language: es

Característica: Validar la creación de una empresa pagadora
  Como Funcionario Banco
  Quiero Realizar la creación de una empresa
  Para Que la empresa quede creada como cliente (Pagador) en la plataforma Supply

  @CP1
  Esquema del escenario: Creación con registro de campos obligatorios
    Dado El funcionario Banco ingresa a la plataforma con las credenciales leidygutierrez0001@yopmail.com, Pass1234*
    Cuando Ingresa la información obligatoria en la creación de empresa
      | <tipoDoc> | <numDoc> | <RazonSocial> |<CIIU>  | <Email> | <nombre> | <primApe> | <numDocUsu> | <telefono> |
    Entonces Se debe crear una nueva empresa en Empresas->Ver todas leidygutierrez0001@yopmail.com


    Ejemplos:
      | tipoDoc | numDoc     | RazonSocial | CIIU | Email                  | nombre    | primApe   | numDocUsu  | telefono   |
      | NIT     | 5565656146 | EmpTest009  | 0115 | EmpTest009@yopmail.com | nomEmpDOS | appEmpDOS | 5041504156 | 1561404164 |
      | NIT     | 1541515056 | EmpTest010  | 0115 | EmpTest010@yopmail.com | nomEmpDOS | appEmpDOS | 5041504156 | 1561404164 |
      | NIT     | 8988884808 | EmpTest011  | 0115 | EmpTest011@yopmail.com | nomEmpDOS | appEmpDOS | 5041504156 | 1561404164 |
      | NIT     | 8889989464 | EmpTest012  | 0115 | EmpTest012@yopmail.com | nomEmpDOS | appEmpDOS | 5041504156 | 1561404164 |
      | NIT     | 1002156541 | EmpTest013  | 0115 | EmpTest013@yopmail.com | nomEmpDOS | appEmpDOS | 5041504156 | 1561404164 |

