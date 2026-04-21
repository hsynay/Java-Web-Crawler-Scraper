# Java Web Crawler & Scraper 🕸️

Bu proje, Java kullanarak web sayfalarından veri çekme (scraping) ve internet üzerinde otomatik gezinme (crawling) mantığını anlamak için geliştirilmiş iki temel araç içerir.

## 🛠️ İçerik ve Özellikler

### 1. WEB.java (Web Scraper)
Bir URL bağlantısı üzerinden HTML içeriğini okuyan temel bir araçtır.
- **Data Stream:** `java.net.URL` ve `Scanner` kullanarak ağ üzerinden veri akışını yönetir.
- **Analiz:** Sayfanın toplam karakter sayısını hesaplar ve içeriği konsola yazdırır.

### 2. WebCrawler.java (Web Crawler)
Belirli bir başlangıç URL'sinden yola çıkarak interneti tarayan bir "örümcek" algoritmasıdır.
- **Algoritma:** BFS (Breadth-First Search) mantığıyla çalışır.
- **Bellek Yönetimi:** `listOfPendingURLs` (bekleyenler) ve `listOfTraversedURLs` (gezilenler) listeleri ile döngüsel çakışmaları engeller.
- **Link Ayıklama:** Sayfa içindeki `http:` bağlantılarını dinamik olarak bulur ve kuyruğa ekler.

## 🚀 Teknik Kazanımlar
- Java Network Programming (URL Sınıfı)
- Exception Handling (Hata Yönetimi)
- Veri Yapıları Yönetimi (ArrayList)
- String Manipülasyonu

## 💻 Çalıştırma
`WebCrawler.java` dosyasını çalıştırdıktan sonra terminale geçerli bir URL (örneğin: https://www.google.com) girerek tarama işlemini başlatabilirsiniz.
