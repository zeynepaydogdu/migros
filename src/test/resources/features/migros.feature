Feature:Migros_01
@wip
  Scenario:Magazadan alacagim secenegi ile sepete urun ekleme
    Given kullanici migros anasayfasina gider
    Then teslimat yontemi belirleye tiklar
    And magazadan alacagim secilir
    And siparisini nerden almak istersin secenegi doldurulur
    And searchboxa "arananUrun" yazilir ve arama butonuna tiklanir
    And cappy ve migros markalari secilir
    And en son urun sepete eklenir
    Then sepetim sayfasina gidilir urun sepette mi kontrolu yapilir
    And sayfayi kapatir