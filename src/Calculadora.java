public class Calculadora extends javax.swing.JFrame {

	String num1;
	String signo;
	String num2;
	
	public Calculadora() {
		initComponents();
		this.setLocationRelativeTo(null);
	}

	/**
	 * This method is called from within the constructor to initialize the
	 * form. WARNING: Do NOT modify this code. The content of this method is
	 * always regenerfted by the Form Editor.
	 */
	@SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jPanel1 = new javax.swing.JPanel();
                btnNum1 = new javax.swing.JButton();
                btnNum4 = new javax.swing.JButton();
                btnNum7 = new javax.swing.JButton();
                btnPunto = new javax.swing.JButton();
                btnMulti = new javax.swing.JButton();
                btnSuma = new javax.swing.JButton();
                btnResta = new javax.swing.JButton();
                btnDivi = new javax.swing.JButton();
                btnC = new javax.swing.JButton();
                btnCE = new javax.swing.JButton();
                jScrollPane1 = new javax.swing.JScrollPane();
                txtDisplay = new javax.swing.JTextArea();
                jLabel1 = new javax.swing.JLabel();
                btnNum2 = new javax.swing.JButton();
                btnNum5 = new javax.swing.JButton();
                btnNum8 = new javax.swing.JButton();
                btnNum0 = new javax.swing.JButton();
                btnNum3 = new javax.swing.JButton();
                btnNum6 = new javax.swing.JButton();
                btnNum9 = new javax.swing.JButton();
                btnIgual = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setTitle("Calculadora");

                jPanel1.setBackground(new java.awt.Color(0, 51, 102));

                btnNum1.setBackground(new java.awt.Color(255, 75, 13));
                btnNum1.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum1.setForeground(new java.awt.Color(51, 51, 51));
                btnNum1.setText("1");
                btnNum1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum1ActionPerformed(evt);
                        }
                });

                btnNum4.setBackground(new java.awt.Color(255, 75, 13));
                btnNum4.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum4.setForeground(new java.awt.Color(51, 51, 51));
                btnNum4.setText("4");
                btnNum4.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum4ActionPerformed(evt);
                        }
                });

                btnNum7.setBackground(new java.awt.Color(255, 75, 13));
                btnNum7.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum7.setForeground(new java.awt.Color(51, 51, 51));
                btnNum7.setText("7");
                btnNum7.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum7ActionPerformed(evt);
                        }
                });

                btnPunto.setBackground(new java.awt.Color(255, 75, 13));
                btnPunto.setFont(new java.awt.Font("Russo One", 0, 32)); // NOI18N
                btnPunto.setForeground(new java.awt.Color(51, 51, 51));
                btnPunto.setText(".");
                btnPunto.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnPuntoActionPerformed(evt);
                        }
                });

                btnMulti.setBackground(new java.awt.Color(255, 75, 13));
                btnMulti.setFont(new java.awt.Font("Russo One", 0, 28)); // NOI18N
                btnMulti.setForeground(new java.awt.Color(51, 51, 51));
                btnMulti.setText("x");
                btnMulti.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnMultiActionPerformed(evt);
                        }
                });

                btnSuma.setBackground(new java.awt.Color(255, 75, 13));
                btnSuma.setFont(new java.awt.Font("Russo One", 0, 32)); // NOI18N
                btnSuma.setForeground(new java.awt.Color(51, 51, 51));
                btnSuma.setText("+");
                btnSuma.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnSumaActionPerformed(evt);
                        }
                });

                btnResta.setBackground(new java.awt.Color(255, 75, 13));
                btnResta.setFont(new java.awt.Font("Russo One", 0, 32)); // NOI18N
                btnResta.setForeground(new java.awt.Color(51, 51, 51));
                btnResta.setText("-");
                btnResta.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnRestaActionPerformed(evt);
                        }
                });

                btnDivi.setBackground(new java.awt.Color(255, 75, 13));
                btnDivi.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnDivi.setForeground(new java.awt.Color(51, 51, 51));
                btnDivi.setText("/");
                btnDivi.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnDiviActionPerformed(evt);
                        }
                });

                btnC.setBackground(new java.awt.Color(255, 75, 13));
                btnC.setFont(new java.awt.Font("Russo One", 0, 28)); // NOI18N
                btnC.setForeground(new java.awt.Color(51, 51, 51));
                btnC.setText("C");
                btnC.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCActionPerformed(evt);
                        }
                });

                btnCE.setBackground(new java.awt.Color(255, 75, 13));
                btnCE.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnCE.setForeground(new java.awt.Color(51, 51, 51));
                btnCE.setText("CE");
                btnCE.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCEActionPerformed(evt);
                        }
                });

                txtDisplay.setEditable(false);
                txtDisplay.setColumns(20);
                txtDisplay.setFont(new java.awt.Font("Roboto Black", 1, 16)); // NOI18N
                txtDisplay.setRows(5);
                jScrollPane1.setViewportView(txtDisplay);

                jLabel1.setFont(new java.awt.Font("Roboto Black", 0, 18)); // NOI18N
                jLabel1.setForeground(new java.awt.Color(255, 255, 255));
                jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
                jLabel1.setText("MADE BY GAMG-94");

                btnNum2.setBackground(new java.awt.Color(255, 75, 13));
                btnNum2.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum2.setForeground(new java.awt.Color(51, 51, 51));
                btnNum2.setText("2");
                btnNum2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum2ActionPerformed(evt);
                        }
                });

                btnNum5.setBackground(new java.awt.Color(255, 75, 13));
                btnNum5.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum5.setForeground(new java.awt.Color(51, 51, 51));
                btnNum5.setText("5");
                btnNum5.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum5ActionPerformed(evt);
                        }
                });

                btnNum8.setBackground(new java.awt.Color(255, 75, 13));
                btnNum8.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum8.setForeground(new java.awt.Color(51, 51, 51));
                btnNum8.setText("8");
                btnNum8.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum8ActionPerformed(evt);
                        }
                });

                btnNum0.setBackground(new java.awt.Color(255, 75, 13));
                btnNum0.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum0.setForeground(new java.awt.Color(51, 51, 51));
                btnNum0.setText("0");
                btnNum0.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum0ActionPerformed(evt);
                        }
                });

                btnNum3.setBackground(new java.awt.Color(255, 75, 13));
                btnNum3.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum3.setForeground(new java.awt.Color(51, 51, 51));
                btnNum3.setText("3");
                btnNum3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum3ActionPerformed(evt);
                        }
                });

                btnNum6.setBackground(new java.awt.Color(255, 75, 13));
                btnNum6.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum6.setForeground(new java.awt.Color(51, 51, 51));
                btnNum6.setText("6");
                btnNum6.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum6ActionPerformed(evt);
                        }
                });

                btnNum9.setBackground(new java.awt.Color(255, 75, 13));
                btnNum9.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnNum9.setForeground(new java.awt.Color(51, 51, 51));
                btnNum9.setText("9");
                btnNum9.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnNum9ActionPerformed(evt);
                        }
                });

                btnIgual.setBackground(new java.awt.Color(255, 75, 13));
                btnIgual.setFont(new java.awt.Font("Russo One", 0, 24)); // NOI18N
                btnIgual.setForeground(new java.awt.Color(51, 51, 51));
                btnIgual.setText("=");
                btnIgual.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnIgualActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(34, 34, 34)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnNum7, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnPunto, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnNum8, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum0, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                        .addComponent(btnNum9, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum6, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnNum3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(btnSuma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnMulti, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(btnResta, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                        .addComponent(btnDivi, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                                .addComponent(jScrollPane1)
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(jLabel1))))
                                .addGap(36, 36, 36))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnC, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCE, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 50, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum4, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum7, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnPunto, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addComponent(btnNum2, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum5, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum8, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum0, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(67, 67, 67)
                                                .addComponent(btnNum6, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnNum9, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnIgual, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(btnDivi, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(btnNum3, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGap(18, 18, 18)
                                                .addComponent(btnMulti, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnSuma, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(btnResta)))
                                .addGap(31, 31, 31))
                );

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                );

                pack();
                setLocationRelativeTo(null);
        }// </editor-fold>//GEN-END:initComponents

        private void btnIgualActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIgualActionPerformed
                String total;
		
		num2 = txtDisplay.getText();
		
		if (!num2.equals("")) {
			total = Operaciones(num1, signo, num2);
			txtDisplay.setText(total);
		}
		
        }//GEN-LAST:event_btnIgualActionPerformed

        private void btnNum1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum1ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"1");
        }//GEN-LAST:event_btnNum1ActionPerformed

        private void btnNum2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum2ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"2");
        }//GEN-LAST:event_btnNum2ActionPerformed

        private void btnNum3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum3ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"3");
        }//GEN-LAST:event_btnNum3ActionPerformed

        private void btnNum4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum4ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"4");
        }//GEN-LAST:event_btnNum4ActionPerformed

        private void btnNum5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum5ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"5");
        }//GEN-LAST:event_btnNum5ActionPerformed

        private void btnNum6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum6ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"6");
        }//GEN-LAST:event_btnNum6ActionPerformed

        private void btnNum7ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum7ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"7");
        }//GEN-LAST:event_btnNum7ActionPerformed

        private void btnNum8ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum8ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"8");
        }//GEN-LAST:event_btnNum8ActionPerformed

        private void btnNum9ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum9ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"9");
        }//GEN-LAST:event_btnNum9ActionPerformed

        private void btnNum0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNum0ActionPerformed
                txtDisplay.setText(txtDisplay.getText()+"0");
        }//GEN-LAST:event_btnNum0ActionPerformed

        private void btnPuntoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPuntoActionPerformed
                String punto;
		punto = txtDisplay.getText();
		
		if (punto.length()<= 0) {
			txtDisplay.setText("0.");
		} else {
			if (!Punto(txtDisplay.getText())){
				txtDisplay.setText(txtDisplay.getText() + ".");
			}
		}
		
        }//GEN-LAST:event_btnPuntoActionPerformed

        private void btnCEActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCEActionPerformed
                String borrar;
		borrar = txtDisplay.getText();
		
		if (borrar.length()>0){
			borrar = borrar.substring(0, borrar.length()-1);
			txtDisplay.setText(borrar);
		}
		
        }//GEN-LAST:event_btnCEActionPerformed

        private void btnCActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCActionPerformed
                txtDisplay.setText("");
        }//GEN-LAST:event_btnCActionPerformed

        private void btnDiviActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDiviActionPerformed
                
		if (!txtDisplay.getText().equals("")) {
			num1 = txtDisplay.getText();
			signo = "/";
			txtDisplay.setText("");
			num2 = txtDisplay.getText();
		}
        }//GEN-LAST:event_btnDiviActionPerformed

        private void btnMultiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMultiActionPerformed
                
		if (!txtDisplay.getText().equals("")) {
			num1 = txtDisplay.getText();
			signo = "X";
			txtDisplay.setText("");
			num2 = txtDisplay.getText();
		}
        }//GEN-LAST:event_btnMultiActionPerformed

        private void btnSumaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSumaActionPerformed
                
		if (!txtDisplay.getText().equals("")) {
			num1 = txtDisplay.getText();
			signo = "+";
			txtDisplay.setText("");
			num2 = txtDisplay.getText();
		}
        }//GEN-LAST:event_btnSumaActionPerformed

        private void btnRestaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestaActionPerformed
                
		if (!txtDisplay.getText().equals("")) {
			num1 = txtDisplay.getText();
			signo = "-";
			txtDisplay.setText("");
			num2 = txtDisplay.getText();
		}
        }//GEN-LAST:event_btnRestaActionPerformed

	public static boolean Punto (String punto){
		boolean resultado;	
		resultado = false;
		for (int i = 0; i < punto.length(); i++){
			if(punto.substring(i , i+1).equals(".")){
				resultado = true;
				break;
			}			
		}
		return resultado;
	}
	
	public static String Operaciones (String num1, String signo, String num2){
		Double total = 0.0;
		String resultado;
		
		if (signo.equals("/")) {
			total = Double.parseDouble(num1)/Double.parseDouble(num2);
		}
		
		if (signo.equals("X")) {
			total = Double.parseDouble(num1)*Double.parseDouble(num2);
		}
		
		if (signo.equals("+")) {
			total = Double.parseDouble(num1)+Double.parseDouble(num2);
		}
		
		if (signo.equals("-")) {
			total = Double.parseDouble(num1)-Double.parseDouble(num2);
		}
		
		resultado = total.toString();
		
		return resultado;
	}
	
	public static void main(String args[]) {
		/* Set the Nimbus look and feel */
		//<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
		/* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
		 */
		try {
			for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
				if ("Nimbus".equals(info.getName())) {
					javax.swing.UIManager.setLookAndFeel(info.getClassName());
					break;
				}
			}
		} catch (ClassNotFoundException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (InstantiationException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (IllegalAccessException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		} catch (javax.swing.UnsupportedLookAndFeelException ex) {
			java.util.logging.Logger.getLogger(Calculadora.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
		}
		//</editor-fold>

		/* Create and display the form */
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new Calculadora().setVisible(true);
			}
		});
	}

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnC;
        private javax.swing.JButton btnCE;
        private javax.swing.JButton btnDivi;
        private javax.swing.JButton btnIgual;
        private javax.swing.JButton btnMulti;
        private javax.swing.JButton btnNum0;
        private javax.swing.JButton btnNum1;
        private javax.swing.JButton btnNum2;
        private javax.swing.JButton btnNum3;
        private javax.swing.JButton btnNum4;
        private javax.swing.JButton btnNum5;
        private javax.swing.JButton btnNum6;
        private javax.swing.JButton btnNum7;
        private javax.swing.JButton btnNum8;
        private javax.swing.JButton btnNum9;
        private javax.swing.JButton btnPunto;
        private javax.swing.JButton btnResta;
        private javax.swing.JButton btnSuma;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTextArea txtDisplay;
        // End of variables declaration//GEN-END:variables
}
