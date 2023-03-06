@parametre
Feature: arama_feature

  Background: googlea_git
    Given kullanici google gider

  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarin "iphone" icerdigini dogrular
    Then close the application
  @smoke
  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarin "tesla" icerdigini dogrular
    Then close the application
@smoke
  Scenario: TC03_google_water_arama
    When kullanici "water" icin arama yapar
    Then sonuclarin "water" icerdigini dogrular
    Then close the application
  @smoke
  Scenario: TC04_google_tea_pot_arama
    When kullanici "porcelain_tea_pot" icin arama yapar
    Then sonuclarin "porcelain_tea_pot" icerdigini dogrular
    Then close the application

  Scenario: TC05_google_skateboard_arama
    When kullanici "skateboard" icin arama yapar
    Then sonuclarin "skateboard" icerdigini dogrular
    Then close the application