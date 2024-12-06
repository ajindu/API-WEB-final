Deskripsi project :
- 
Proyek ini bertujuan untuk membuat kerangka pengujuan API dan Web Automation dengan menggunakan RestAssured (untuk api), Selenium (untuk web) , Cucumber, dan WebDriverManager yang megadopsi konsep Page Object Model (POM). 
Fokus utama dari proyek ini adalah untuk menguji berbagai skenario pengujian terkait fungsionalitas API (Gorest) dan antarmuka web dari aplikasi (https://www.demoblaze.com/) yang disediakan.

1. API Automation Test  
Pengujian dilakukan pada API yang mengelola data user (CRUD). Pengujian API menggunakan RestAssured untuk validasi respons HTTP dan kesesuaian dengan JSON Schema. 
Skenario pengujian meliputi:

    - GET List Users: Memverifikasi pengambilan daftar user dengan status 200.
    - POST Create User: Menguji pembuatan user baru dengan status 201.
    - PATCH Update User: Menguji pembaruan data user dengan status 200.
    - DELETE User: Menguji penghapusan user dengan status 204.
    - POST Invalid User: Menguji pembuatan user dengan status tidak valid (422).


1. Web Automation Test  
Pengujian dilakukan pada aplikasi web dengan Selenium WebDriver untuk mengotomatisasi interaksi UI. Pengujian UI dilakukan dengan berbagai interaksi seperti klik tombol dan pengisian formulir, menggunakan metode pencarian elemen Selenium.  
Skenario pengujian meliputi:
    - Sign Up/Login: Menguji pendaftaran dan login pengguna yang valid atau tidak valid.
    - Produk: Menguji navigasi produk, penambahan/ penghapusan produk dari keranjang, dan proses checkout.
    - Logout: Memverifikasi proses logout dan tampilan UI yang sesuai.
      
Cara run project :
-
API :
- Buka project menggunakan Intellij Idea
- Buka terminal
- Ketik ./gradlew apiTest
- Enter
  
Web :
- Buka project menggunakan Intellij Idea
- Buka terminal
- Ketik ./gradlew webTes
- Enter

Konfigurasi project :
-
1. Struktur Direktori Proyek :

    src/test/java/ :
  - pages/ : Berisi kelas API Page dan Web Page, berfungsi untuk melakukan aksi pada elemen-elemen halaman api dan web.
  - stepDef/ : Berisi kelas API Step dan Web Step, berfungsi sebagai step definitions untuk Cucumber.
  - helper/ : Berisi kelas Utility, Models, dan Endpoint yang mengelola fungsi dan konfigurasi WebDriver

    src/test/resources/ :
  - features/ : Berisi file fitur Cucumber dalam format .feature, yang mendefinisikan skenario pengujian.
    
2. Dependensi :
Konfigurasi dependensi untuk RestAssured, Selenium, Cucumber, dan WebDriverManager
![Screenshot 2024-12-03 141800](https://github.com/user-attachments/assets/3de7fc74-165a-4bc0-b1cc-7c6a7830dc68)

3. Pengaturan Driver Selenium (WebDriverManager):
WebDriverManager digunakan untuk mengelola driver browser secara otomatis dengan konfigurasi sebagai berikut :
![Screenshot 2024-12-03 123151](https://github.com/user-attachments/assets/4bb63173-d1a0-4b3f-9a18-c2e576b372aa)


Screenshot hasil pengujian tes API dan WEB :
-
API Automation  
![Screenshot 2024-12-06 092120](https://github.com/user-attachments/assets/b8d84dfd-5cf2-4c6a-98ec-bcc45e3946f7)
![Screenshot 2024-12-06 092132](https://github.com/user-attachments/assets/83ec1bc0-5265-427f-8a4a-86cdd0700eb1)
![Screenshot 2024-12-06 092148](https://github.com/user-attachments/assets/17c855c1-23a9-47a7-8cb9-7378c585e7c4)
![Screenshot 2024-12-06 092202](https://github.com/user-attachments/assets/acb98447-ccd9-4e06-882b-e9242a22d0d5)
![Screenshot 2024-12-06 092219](https://github.com/user-attachments/assets/87f06448-6d07-4e46-9f6c-473c4af17e05)
![Screenshot 2024-12-06 092232](https://github.com/user-attachments/assets/1bd50388-c54c-4889-8a21-3f2c9fb1fc42)
![Screenshot 2024-12-06 092247](https://github.com/user-attachments/assets/01f1b8b6-9895-482a-9328-8ae33f8ef092)
![Screenshot 2024-12-06 092258](https://github.com/user-attachments/assets/dcf600b5-6191-40bc-b879-cf333f094ac0)
![Screenshot 2024-12-06 092310](https://github.com/user-attachments/assets/1dc62152-e5eb-4588-8cd6-a8689fd1b718)
![Screenshot 2024-12-06 092332](https://github.com/user-attachments/assets/66f74476-9500-45dd-8eaa-2b3f96aae17e)
![Screenshot 2024-12-06 092343](https://github.com/user-attachments/assets/871e53c1-b098-450b-87c5-7f721b0c1f8d)


WEB Automation
![Screenshot 2024-12-06 094001](https://github.com/user-attachments/assets/6f4b2f6a-09fe-4972-9156-1c1013e40c6e)
![Screenshot 2024-12-06 094038](https://github.com/user-attachments/assets/c94ee34f-085a-4f17-a954-d77d5972cdf4)
![Screenshot 2024-12-06 094055](https://github.com/user-attachments/assets/fe045000-c9e0-49b6-aea7-d53f938d2c95)
![Screenshot 2024-12-06 094107](https://github.com/user-attachments/assets/770a8b8d-00e3-4197-bc41-d164743cd33c)
![Screenshot 2024-12-06 094123](https://github.com/user-attachments/assets/4825c202-95f5-40f3-bd67-32c2d6fda94d)
![Screenshot 2024-12-06 094136](https://github.com/user-attachments/assets/9b6617b5-6a3e-4a12-af56-75ec741a1c10)
![Screenshot 2024-12-06 094150](https://github.com/user-attachments/assets/66c019b3-6f53-455a-8843-39cf6f6aefc7)
![Screenshot 2024-12-06 094201](https://github.com/user-attachments/assets/d329d31d-7a4a-40cc-9309-584b1f18ecce)
![Screenshot 2024-12-06 094213](https://github.com/user-attachments/assets/bbf5d411-1679-46b6-b3fe-f0c6355e97bf)
![Screenshot 2024-12-06 094225](https://github.com/user-attachments/assets/1f3d9c97-acd5-4f2e-b542-903a43812632)
![Screenshot 2024-12-06 094238](https://github.com/user-attachments/assets/ae88e5e9-108e-41bc-abed-df3d1c02e0a8)
![Screenshot 2024-12-06 094250](https://github.com/user-attachments/assets/b23d538d-648d-4891-947e-997e84731a78)
![Screenshot 2024-12-06 094302](https://github.com/user-attachments/assets/696c38ec-6dd6-46c9-bf1f-21a47c703b42)
![Screenshot 2024-12-06 094314](https://github.com/user-attachments/assets/5b0d4fd5-f383-4644-9697-2aa36d68fbc8)
![Screenshot 2024-12-06 094332](https://github.com/user-attachments/assets/d22fca27-d830-454c-867e-4dc4e71cb79c)


Cucumber HTML Report
-
API Report
![Screenshot 2024-12-06 094717](https://github.com/user-attachments/assets/c3ee24ff-2dd7-409a-8ca4-6b1b34a13884)
![Screenshot 2024-12-06 094736](https://github.com/user-attachments/assets/5bf6e5a4-b155-472c-8d23-8f4dbc39c93c)
![Screenshot 2024-12-06 094747](https://github.com/user-attachments/assets/59dc271e-98f7-49d3-b981-8e1d3a66e460)
![Screenshot 2024-12-06 094801](https://github.com/user-attachments/assets/73c7d2ae-b96c-4528-a7c1-e2fa529b8b0f)
![Screenshot 2024-12-06 094810](https://github.com/user-attachments/assets/d87a23ec-1225-421b-b150-95d3dc9aa257)
![Screenshot 2024-12-06 094820](https://github.com/user-attachments/assets/7a5b82b7-c424-40ca-89f6-a9f9e9a378d6)

Web Report
![Screenshot 2024-12-06 094831](https://github.com/user-attachments/assets/98d50a04-d4bd-4044-a2f0-4d8ac9396b65)
![Screenshot 2024-12-06 094841](https://github.com/user-attachments/assets/e15e61eb-2b4e-48f7-97f5-f912ac46b861)
![Screenshot 2024-12-06 094914](https://github.com/user-attachments/assets/f1312251-f579-4aca-b515-8adc1564e9af)
![Screenshot 2024-12-06 094928](https://github.com/user-attachments/assets/4abf2b05-e4f2-4ce1-b3b0-fb6f3d432e47)
![Screenshot 2024-12-06 094938](https://github.com/user-attachments/assets/99420b84-d246-44f3-a9ba-7288e4e0dc2f)
![Screenshot 2024-12-06 094951](https://github.com/user-attachments/assets/b0add007-3ada-4532-a70d-817a281d1301)
![Screenshot 2024-12-06 095004](https://github.com/user-attachments/assets/031b7401-df2a-4d02-8ffb-ec9643d72971)
![Screenshot 2024-12-06 095015](https://github.com/user-attachments/assets/b8e957b9-1ac1-4087-b6fd-f0c46321838e)
![Screenshot 2024-12-06 095025](https://github.com/user-attachments/assets/4afd237a-dd59-48dc-8838-33f4f82b9ae7)
![Screenshot 2024-12-06 095042](https://github.com/user-attachments/assets/97fbef62-b85e-40b0-bd9c-ba4bedfb08c3)
![Screenshot 2024-12-06 095051](https://github.com/user-attachments/assets/b40b0778-ec46-4a0a-a9fc-91aaf1fcec94)


GitHub Actions Workflow 
-
API Workflow


Web Workflow











