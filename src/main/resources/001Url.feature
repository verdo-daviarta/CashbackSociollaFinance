Feature: Proses input URL
#1
  @positive
  Scenario: Input URL yang valid
    Given Input URL Cashback Sociolla Tunjungan Surabaya yang valid
    When Klik tombol enter pada keyboard
    Then Menampilkan halaman Login

  @negatif
  Scenario: Input URL yang tidak valid
    Given Input URL yang salah Cashback Sociolla Tunjungan Surabaya yang valid
    When Klik tombol enter pada keyboard
    Then tidak Menampilkan halaman Login