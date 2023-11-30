# language: es

Característica: Validar la creación de una condición financiera
  Como Funcionario Banco
  Quiero Realizar la creación de un plan tradicional de financiación
  Para Que la empresa quede habilitada para realizar negociaciones

  @CP2
  Esquema del escenario: Crear una condición financiera de plan tradicional en la plataforma Supply
    Dado El usuario se loguea en la plataforma con las credenciales leidygutierrez0001@yopmail.com, Pass1234*
    Y Ingresa a la información de la empresa Pagadora
    Cuando Da clic en el botón Crear Plan en el menú Empresas>Ver todo> “Nombre de la empresa”>Condiciones financieras
    Y Ingrese los datos obligatorios para un plan tradicional del producto Comisión
      | <GrupoEcono> | <LigadoProv> | <TasaMin> | <TasaNeg> | <Vigencia> | <TasaEsp> | <Plazo> |
    Entonces Se debería poder crear correctamente el plan de financiación tradicional leidygutierrez0001@yopmail.com


    Ejemplos:
      | GrupoEcono | LigadoProv | TasaMin | TasaNeg | Vigencia | TasaEsp | Plazo |
      | no         | no         | 3,2102  | 4,002   | 180      | no      | 30    |