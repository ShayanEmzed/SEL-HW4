# SEL-HW4
آشنایی با الگوها و ابزارهای بازآرایی کد
## بخش عملی
### دو مورد الگوی Facade
۱. اگر به فایل main نگاه کنیم متوجه می‌شویم که تابع اصلی و ورودی برنامه برای parse کردن فایل ورودی، از سه کلای Parser، Scanner و File استفاده می‌کند. با این حال، کلاینت فقط به parse شدن کدش اهمیت می‌دهد و نحوه وصل کردن و ورودی دادن به کلاس Parser باعث پیچدگی کار شده است‌. در نتیجه با ایجاد یک کلاس facade برای کامپوننت parser، با ورودی گرفتن یک file path، کد parse شده را خروجی می‌دهیم.
کلاس facade ایجاد شده:

<img width="514" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/6044dd79-bde5-4b92-85aa-6326839b8e5c">

تابع main پس از اعمال الگو:

<img width="441" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/da35fd38-3e01-4b2d-aef7-2c863da11366">

۲. برای ایجاد شیء parseTable در کلاس Parser، از سه subsystem استفاده شده است. برای کم کردن این پیچیدگی و همینطور خواناتر کردن کد می‌توانیم یک کلاس tableFacade تعریف کرده و شیء ایجاد شده را خروجی دهیم.  
کلاس facade ایجاد شده:

<img width="505" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/8a3de7cc-1961-4385-b5cd-e9588cc16cdb">

تابع parser constructor پس از اعمال الگو:

<img width="551" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/f9c7011b-0423-4078-a52d-22760a155527">

### استفاده از polymorphism به جای شرط
در کلاس Adress و متد toString داریم:

<img width="259" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/3d799880-d2b7-4554-9d62-d883300fc1c8">

همانطور که مشاهده می‌شود با توجه به تایپ شیء خروجی‌های مختلفی خواهیم داشت. برای پیروی از قانون tell-don't-ask از polymorphism استفاده می‌کنیم. ویژگی type در کلاس Address حذف شده و addressContext جای آن را می‌گیرد.

<img width="650" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/904d6317-5d55-47aa-a855-eb40420eaf9f">

در مجموع سه استراتژی برای Address تعریف کرده‌ایم کرده‌ایم که هرسه باید از AddressStrategy که یک interface است ارث‌بری و متد getString را اورراید کنند. در کلاس AddressContext، این سه استراتژی ست شده و در کلاینت Address از آنها استفاده می‌شود:

<img width="572" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/05e96b84-d058-4bc7-9a12-01889fa8a589">

### الگو Separate Query From Modifier
در فایل SymbolTable، آخرین متد، برای گرفتن آخرین پارامتر (query)، مقدار index هم یکی اضافه می‌شود (command):

<img width="770" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/c53bbc62-0c8b-4e8a-8244-672ba951374c">

برای جدا کردن این دو منطق در زیر همین متد، متد دیگری تعریف می‌کنیم که وظیفه اضافه کردن index را به عهده داشته باشد:

<img width="378" alt="image" src="https://github.com/ShayanEmzed/SEL-HW4/assets/60621655/d3dc2c79-491b-4c3e-aba2-d082490b142a">

حال در فایل CodeGenerator که از تابع getNextParameter استفاده می‌کرد، پس از دریافت پارامتر مقدار index را هم افزایش می‌دهیم. با اینکار اگر چندین بار عمل query را تکرار کنیم، مثلا برای دیباگ، به مشکل runtime نمی‌خوریم و کد به درستی کامپایل می‌شود.



