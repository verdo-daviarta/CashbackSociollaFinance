Feature: Proses Login
#1
  @positif
  Scenario: user berhasil login dengan username dan password yang valid
    Given User di halaman login
    When User memasukan username yang valid
    And User memasukan password yang valid
    And User klik tombol login
    Then User berhasil login dan diarahkan ke dashbor

  @negatif-username
  Scenario: user berhasil login dengan username dan password yang valid
    Given User di halaman login
    When User memasukan username yang invalid
    And User memasukan password yang valid
    And User klik tombol login
    Then User tidak berhasil login dan diarahkan ke halaman login

  @negatif-password
  Scenario: user berhasil login dengan username dan password yang valid
    Given User di halaman login
    When User memasukan username yang valid
    And User memasukan password yang invalid
    And User klik tombol login
    Then User tidak berhasil login dan diarahkan ke halaman login

