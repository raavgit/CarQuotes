Feature: Check the details quotes

  Scenario Outline: Check the details on the quote are correct

    Given User is on homepage
   When user enters <regNumber> and <miles>
    When he click on get my valuation
    Then user should see valid car <regNumber>, <make> , <model> and <year>

    Examples:


      | regNumber | make       | model                                                    | year | miles |
      | SG18HTN   | Volkswagen | Golf 1.5 TSI EVO SE Nav SG18 HTN                         | 2018 | 4000  |
      | AD58VNF   | BMW        | 1 SERIES DIESEL COUPE - 120d M Sport 2dr                 | 2008 | 3000  |
      | BW57BOF   | TOYOTA     | YARIS HATCHBACK - 1.0 VVT-i T2 3dr                       | 2008 | 12000 |
      | KT17DLX   | SKODA      | SUPERB DIESEL ESTATE - 2.0 TDI CR 190 Sport Line 5dr DSG | 2017 | 21000 |
