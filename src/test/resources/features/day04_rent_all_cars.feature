@rentall_cars
Feature: sisteme_giris_yapma
@testrunner
  Scenario Outline: TC01_kullanici tum manager login bilgileriyle giriş yapabilmeli
    Given kullanici ana sayfada
    When kullanici login sayfasina gider
    And kullanıcı email alanina "<email>" bilgilerini yazar
    And password alanina "<password>" bilgilerini yazar
    And login buttonuna basar
    Then login islemi gerçekleşir


    Examples:
      | email                          | password  |
      | sam.walker@bluerentalcars.com  | c!fas_art |
      | kate.brown@bluerentalcars.com  | tad1$Fas  |
      | raj.khan@bluerentalcars.com    | v7Hg_va^  |
      | pam.raymond@bluerentalcars.com | Nga^g6!   |