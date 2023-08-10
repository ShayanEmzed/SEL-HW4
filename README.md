# SEL-HW4
آشنایی با الگوها و ابزارهای بازآرایی کد
## بخش عملی
### دو مورد الگوی Facade
۱. اگر به فایل main نگاه کنیم متوجه می‌شویم که تابع اصلی و ورودی برنامه برای parse کردن فایل ورودی، از سه کلای Parser، Scanner و File استفاده می‌کند. با این حال، کلاینت فقط به parse شدن کدش اهمیت می‌دهد و نحوه وصل کردن و ورودی دادن به کلاس Parser باعث پیچدگی کار شده است‌. در نتیجه با ایجاد یک کلاس facade برای کامپوننت parser، با ورودی گرفتن یک file path، کد parse شده را خروجی می‌دهیم.
کلاس facade ایجاد شده:

<img width="514" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/6044dd79-bde5-4b92-85aa-6326839b8e5c">

تابع main پس از اعمال الگو:

<img width="441" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/da35fd38-3e01-4b2d-aef7-2c863da11366">

