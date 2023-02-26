@personel_olusturma
Feature: personel_olusturma

  Scenario Outline: TC01_personel_olustur
    Given kullanici "https://editor.datatables.net/" gider
    When kullanici new butonuna tiklar
    And kullanici first name "<firstname>" girer
    And kullanici last name "<lastname>" girer
    And kullanici positions "<positions>" girer
    And kullanici office "<office>" girer
    And kullanici extension "<extension>" girer
    And kullanici start_date "<start_date>" girer
    And kullanici salary "<salary>" girer
    And kullanici create buttonuna tiklar
    When kullanici firstname ile "<firstname>" arar
    Then firstname "<firstname>" in olustugunu test et
    And close the application

    Examples:personel bilgileri
      | firstname |lastname|positions|office|extension|start_date|salary|
      | john     | walker | SDET    | ISTANBUL |345 |2023-03-01|100000  |
      | Rose     | Edward | QA      | Canada   |346 |2023-05-21|250000  |
      | Aly     | Spak    | SDET    | NewYork  |431 |2022-03-01|450000  |
      | Rojin   | Linda    | Dev    | Holland  |434 |2022-02-01|870000  |











