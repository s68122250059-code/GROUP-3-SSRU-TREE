## 🚀 คุณสมบัติของระบบ (Key Features)

1. **Algorithm Comparison (การสร้าง Tree 2 วิธี):**
   * **Algorithm A (Postfix Build):** สร้าง Expression Tree จาก Postfix Expression โดยใช้ Stack (O(N) Time / O(N) Space)
   * **Algorithm B (Prefix Build):** สร้าง Expression Tree จาก Prefix Expression โดยใช้ Recursion (O(N) Time / O(N) Space)
2. **Tree Traversals:**
   * **Infix Traversal:** แสดงนิพจน์แบบ Infix พร้อมจัดลำดับวงเล็บ
   * **Prefix Traversal:** ท่องต้นไม้แบบ Pre-order
   * **Postfix Traversal:** ท่องต้นไม้แบบ Post-order
3. **Metrics & Search Operations:**
   * **Evaluate Result:** คำนวณผลลัพธ์นิพจน์คณิตศาสตร์ด้วย Post-order Traversal
   * **Search Node:** ค้นหาโหนดข้อมูลภายใน Expression Tree
   * **Tree Analytics:** คำนวณความสูง Tree (`treeHeight`), จำนวน Operators (`countOperators`), และ Operands (`countOperands`)
  
   *⚖️ สรุปการเลือกใช้งาน (Algorithm Trade-offs)
Algorithm A (Postfix + Stack): เหมาะกับ ระบบการทำงานจริง (Production) ที่ต้องรองรับนิพจน์ขนาดใหญ่ ป้องกันปัญหา Memory Stack Overflow

Algorithm B (Prefix + Recursion): เหมาะสำหรับการ ประมวลผลแบบ Read-ahead / Compiler Parsing ที่เน้นความกระชับของโค้ด และข้อมูลมีขนาดควบคุมได้
