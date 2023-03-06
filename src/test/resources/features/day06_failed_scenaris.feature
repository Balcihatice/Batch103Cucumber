
@failed_scenario
Feature: hooks_test
  Background: googlea_git
    Given kullanici google gider

    #Bu scenariolari bilerek failed ettik


  Scenario: TC01_google_iphone_arama
    When kullanici "iphone" icin arama yapar
    Then sonuclarin "tea pot" icerdigini dogrular
    Then close the application

  Scenario: TC02_google_tesla_arama
    When kullanici "tesla" icin arama yapar
    Then sonuclarin "toros" icerdigini dogrular
    Then ekran goruntusu al
    Then close the application