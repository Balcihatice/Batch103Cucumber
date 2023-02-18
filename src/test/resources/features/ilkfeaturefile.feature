Feature: ilk feature file
  Scenario: google_iphone_arama
  Given kullanici google gider
  When kullanici iphone icin arama yapar
  Then sonucun iphine oldugunu dogrular



  #1-Her feature file, Feature: kelimesi ile baslamak zorundadir
  #Feature ye Test dosyasi =Epic denir
  #2- Her bir file da yalniz bir Feature kullanilabilir
  #3- Scenario(testCase) : test case olusturmak icin, Birden fazla Scenario kullanabiliriz
  #4- verification yapacagimizda Then kullanmaliyiz
  #5- Her bir adim Given, Then, When, And, But,*  kelimelerinden biriyle baslamalidir
  #6- Given -> Genelde ilk satirlarda pre condition stepleri icin kullanilir
  #7- Then -> Genelde son satirlarda, verification sstepleri icin kullanilir
  #8- And ve When kelimeleri ara adimlarda baglac olarak kullanilir
  #NOT: Teknik olarak istenilen kelime istenilen yerde kullanilabilir,ama anlam karmasasi
  #olmamasi icin bu adimlar takip edilir.