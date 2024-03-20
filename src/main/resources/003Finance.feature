Feature: Halaman Finance
  @Positif-UpdateSudahTransfer
  Scenario: user berhasil Update data sudah di transfer
    Given User login
    When User klik menu finance
    And User mencari data yang sudah di transfer
    And User klik button cekbox
    And User klik button update sudah di transfer
    And User klik button save
    Then User berhasil update data yang sudah ditransfer



