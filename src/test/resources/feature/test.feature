#Autor: Miguel Alvarez

@Crear nota en negrita
Feature: Crear una nota con texto enriquecido

  Scenario: Texto en negrita
    Given Que el usuario ingresa a  bloc de notas online
    When Selecciona Nota de texto enriquecido y diligencia la nota
    |strNotaNegrita     |
    |Prueba nota negrita|
    Then Se valida que se crea la nota
    |getSrtTextoFinal|
    |Note_1, 06-Jul-|