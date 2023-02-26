
@google_search
Feature: ilk feature file

  Background: Google_sayfasina git
    Given kullanici google gider

  @iphone
  Scenario: google_iphone_arama
    When kullanici iphone icin arama yapar
    Then sonucun iphone oldugunu dogrular
    And close the application

  @tesla
  Scenario: TC02_google_tesla_arama
    When kullanici tesla icin arama yapar
    Then sonuclarda tesla oldugunu dogrular
    And close the application

  

  #1-Her feature file, Feature: kelimesi ile baslamak zorundadir
  #Feature ye Test dosyasi =Epic denir
  #2- Her bir file da yalniz bir Feature kullanilabilir
  #3- Scenario(testCase) : test case masturbatory icin, Birden fazla Scenario kullanabiliriz
  #4- verification yapacagimizda Then kullanmaliyiz
  #5- Her bir adim Given, Then, When, And, But,*  kelimelerinden biriyle baslamalidir
  #6- Given -> Genelde ilk satirlarda pre condition stepleri icin kullanilir
  #7- Then -> Genelde son satirlarda, verification stepleri icin kullanilir
  #8- And ve When kelimeleri ara adimlarda baglac olarak kullanilir
  #NOT: Teknik olarak istenilen kelime istenilen yerde kullanilabilir,ama anlam karmasasi
  #olmamasi icin bu adimlar takip edilir.
  #  ama anlam karmasasi olmamasi icin bu adimlar takip edilir
#  9. Belirli Scenario lari calistirmak icin cucumber tags ler kullanilir
#  tag ler Fetuature, Scenario, Scerio Outline, Examples kelimeleri ile birlikte kullanilabilir
#  10. Background: Her bir Scenario kelimesinden ONCE tek bir sefer calisir
  #11- dryRun=false-> dryRun yokmus gibi calisir.Yani tum adimlari tek tek browserda acar
  #    dryRun=true -> Yeni stepeklendiginde sadece tanimlanmamis step definitionslari olusturmak icin kullanilir
  #   Bunu  kullanilma sebebi zamandan tasarruftur.