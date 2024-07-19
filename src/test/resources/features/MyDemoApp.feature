Feature: Agrego productos en mi sauce lab app

  @TestSauceLabs
  Scenario Outline: Agrego productos en mi sauce lab app
    Given estoy en la aplicacion de SauceLabs
    And valido que carguen correctamente los productos en la galeria
    When agrego <UNIDADES> del siguiente <PRODUCTO>
    Then Valido el carrito de compra actualice correctamente

    Examples:
      | PRODUCTO                  | UNIDADES |
      | Sauce Labs Backpack       | 1        |
#      | Sauce Labs Bolt - T-Shirt | 1        |
#      | Sauce Labs Bike Light     | 2        |