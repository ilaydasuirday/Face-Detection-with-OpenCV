package EmployeeManagement;

import javax.swing.table.*;

public class FindEmployee extends javax.swing.JFrame {

    private MyHashTable hashTable;

    public FindEmployee() {
        initComponents();
        fullTimeEmployeePanel.setVisible(false);
        partTimeEmployeePanel.setVisible(false);
    }

    public void setHashTable(MyHashTable table)
    {
        hashTable = table;

    }

    public MyHashTable getHashTable()
    {
        return(hashTable);
    }



    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        employeeTypeButtonGroup = new javax.swing.ButtonGroup();
        genderButtonGroup = new javax.swing.ButtonGroup();
        FindEmployeeLabel = new javax.swing.JLabel();
        WelcomeLabel = new javax.swing.JLabel();
        partTimeEmployeeRadioButton = new javax.swing.JRadioButton();
        fullTimeEmployeeRadioButton = new javax.swing.JRadioButton();
        EmployeeNumberLabel = new javax.swing.JLabel();
        EmployeeNumberInputField = new javax.swing.JTextField();
        EmployeeNameLabel = new javax.swing.JLabel();
        FirstNameInputField = new javax.swing.JTextField();
        LastNameInputField = new javax.swing.JTextField();
        ConductSearchButton = new javax.swing.JButton();
        EmployeeTabbedPane = new javax.swing.JTabbedPane();
        fullTimeEmployeePane = new javax.swing.JScrollPane();
        fullTimeEmployeeTable = new javax.swing.JTable();
        partTimeEmployeePane = new javax.swing.JScrollPane();
        partTimeEmployeeTable = new javax.swing.JTable();
        employeeGenderLabel = new javax.swing.JLabel();
        employeeWorkLocationLabel = new javax.swing.JLabel();
        employeeDeductionRateLabel = new javax.swing.JLabel();
        deductionRateInput = new javax.swing.JTextField();
        maleRadioButton = new javax.swing.JRadioButton();
        femaleRadioButton = new javax.swing.JRadioButton();
        otherGenderRadioButton = new javax.swing.JRadioButton();
        fullTimeEmployeePanel = new javax.swing.JPanel();
        annualSalaryLabel = new javax.swing.JLabel();
        annualSalaryInput = new javax.swing.JTextField();
        partTimeEmployeePanel = new javax.swing.JPanel();
        hourlyWageLabel = new javax.swing.JLabel();
        hoursPerWeekLabel = new javax.swing.JLabel();
        weeksPerYearLabel = new javax.swing.JLabel();
        hourlyWageInput = new javax.swing.JTextField();
        hoursPerWeekInput = new javax.swing.JTextField();
        weeksPerYearInput = new javax.swing.JTextField();
        workLocationInput = new javax.swing.JComboBox<>();
        seeTableButton = new javax.swing.JButton();
        RemoveEmployeeButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(829, 659));
        setResizable(false);
        setSize(new java.awt.Dimension(829, 659));

        FindEmployeeLabel.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        FindEmployeeLabel.setText("Find Employee");

        WelcomeLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        WelcomeLabel.setText("Please input some Employee Identification Information");

        employeeTypeButtonGroup.add(partTimeEmployeeRadioButton);
        partTimeEmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        partTimeEmployeeRadioButton.setText("Part Time Employee");
        partTimeEmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                partTimeEmployeeRadioButtonActionPerformed(evt);
            }
        });

        employeeTypeButtonGroup.add(fullTimeEmployeeRadioButton);
        fullTimeEmployeeRadioButton.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N
        fullTimeEmployeeRadioButton.setText("Full Time Employee");
        fullTimeEmployeeRadioButton.setToolTipText("");
        fullTimeEmployeeRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fullTimeEmployeeRadioButtonActionPerformed(evt);
            }
        });

        EmployeeNumberLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EmployeeNumberLabel.setText("Employee Number:");

        EmployeeNumberInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EmployeeNumberInputFieldActionPerformed(evt);
            }
        });

        EmployeeNameLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        EmployeeNameLabel.setText("Employee Name:");

        FirstNameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FirstNameInputFieldActionPerformed(evt);
            }
        });

        LastNameInputField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                LastNameInputFieldActionPerformed(evt);
            }
        });

        ConductSearchButton.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        ConductSearchButton.setText("Find Match");
        ConductSearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConductSearchButtonActionPerformed(evt);
            }
        });

        fullTimeEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Employee Number", "First Name", "Last Name", "Gender", "Work Location", "Deduction Rate", "Annual Salary"
                }
        ));
        fullTimeEmployeePane.setViewportView(fullTimeEmployeeTable);

        EmployeeTabbedPane.addTab("Full Time Employee", fullTimeEmployeePane);

        partTimeEmployeeTable.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {

                },
                new String [] {
                        "Employee Number", "First Name", "Last Name", "Gender", "Work Location", "Deduction Rate", "Hourly Wage", "Hours Per Week", "Weeks Per Year"
                }
        ));
        partTimeEmployeePane.setViewportView(partTimeEmployeeTable);

        EmployeeTabbedPane.addTab("Part Time Employee", partTimeEmployeePane);

        employeeGenderLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        employeeGenderLabel.setText("Employee Gender:");

        employeeWorkLocationLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        employeeWorkLocationLabel.setText("Employee Work Location: ");

        employeeDeductionRateLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        employeeDeductionRateLabel.setText("Employee Deduction Rate:");

        genderButtonGroup.add(maleRadioButton);
        maleRadioButton.setText("Male");
        maleRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                maleRadioButtonActionPerformed(evt);
            }
        });

        genderButtonGroup.add(femaleRadioButton);
        femaleRadioButton.setText("Female");

        genderButtonGroup.add(otherGenderRadioButton);
        otherGenderRadioButton.setText("Other");

        annualSalaryLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        annualSalaryLabel.setText("Annual Salary:");

        javax.swing.GroupLayout fullTimeEmployeePanelLayout = new javax.swing.GroupLayout(fullTimeEmployeePanel);
        fullTimeEmployeePanel.setLayout(fullTimeEmployeePanelLayout);
        fullTimeEmployeePanelLayout.setHorizontalGroup(
                fullTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fullTimeEmployeePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(annualSalaryLabel)
                                .addGap(10, 10, 10)
                                .addComponent(annualSalaryInput, javax.swing.GroupLayout.DEFAULT_SIZE, 204, Short.MAX_VALUE)
                                .addContainerGap())
        );
        fullTimeEmployeePanelLayout.setVerticalGroup(
                fullTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(fullTimeEmployeePanelLayout.createSequentialGroup()
                                .addGap(19, 19, 19)
                                .addGroup(fullTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(annualSalaryInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(annualSalaryLabel))
                                .addContainerGap(57, Short.MAX_VALUE))
        );

        hourlyWageLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hourlyWageLabel.setText("Hourly Wage:");

        hoursPerWeekLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        hoursPerWeekLabel.setText("Hours Per Week:");

        weeksPerYearLabel.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        weeksPerYearLabel.setText("Weeks Per Year");

        hourlyWageInput.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                hourlyWageInputActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout partTimeEmployeePanelLayout = new javax.swing.GroupLayout(partTimeEmployeePanel);
        partTimeEmployeePanel.setLayout(partTimeEmployeePanelLayout);
        partTimeEmployeePanelLayout.setHorizontalGroup(
                partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(partTimeEmployeePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(partTimeEmployeePanelLayout.createSequentialGroup()
                                                .addComponent(hourlyWageLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(partTimeEmployeePanelLayout.createSequentialGroup()
                                                .addComponent(weeksPerYearLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(partTimeEmployeePanelLayout.createSequentialGroup()
                                                .addComponent(hoursPerWeekLabel)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                                                .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(46, Short.MAX_VALUE))
        );
        partTimeEmployeePanelLayout.setVerticalGroup(
                partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(partTimeEmployeePanelLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hourlyWageLabel)
                                        .addComponent(hourlyWageInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(hoursPerWeekLabel)
                                        .addComponent(hoursPerWeekInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(7, 7, 7)
                                .addGroup(partTimeEmployeePanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(weeksPerYearLabel)
                                        .addComponent(weeksPerYearInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(26, Short.MAX_VALUE))
        );

        workLocationInput.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "", "Toronto", "Mississauga", "New York" }));

        seeTableButton.setText("See Table:");
        seeTableButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                seeTableButtonActionPerformed(evt);
            }
        });

        RemoveEmployeeButton.setText("Remove ");
        RemoveEmployeeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                RemoveEmployeeButtonActionPerformed(evt);
            }
        });

        saveButton.setText("SAVE");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(EmployeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 809, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(43, 43, 43)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(WelcomeLabel)
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addComponent(employeeWorkLocationLabel)
                                                                                .addGap(18, 18, 18)
                                                                                .addComponent(workLocationInput, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                                        .addGroup(layout.createSequentialGroup()
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addComponent(EmployeeNameLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(employeeGenderLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                        .addComponent(EmployeeNumberLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(55, 55, 55)
                                                                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                                                        .addComponent(EmployeeNumberInputField)
                                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                                .addComponent(FirstNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                                                                .addGap(18, 18, 18)
                                                                                                                .addComponent(LastNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, 260, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                                                                                .addComponent(femaleRadioButton)
                                                                                                                .addGap(192, 192, 192)
                                                                                                                .addComponent(otherGenderRadioButton))))
                                                                                        .addGroup(layout.createSequentialGroup()
                                                                                                .addGap(52, 52, 52)
                                                                                                .addComponent(maleRadioButton)))))
                                                                .addGroup(layout.createSequentialGroup()
                                                                        .addComponent(employeeDeductionRateLabel)
                                                                        .addGap(18, 18, 18)
                                                                        .addComponent(deductionRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                                        .addGap(128, 128, 128)
                                                                        .addComponent(partTimeEmployeeRadioButton)
                                                                        .addGap(244, 244, 244)
                                                                        .addComponent(fullTimeEmployeeRadioButton)))
                                                        .addGroup(layout.createSequentialGroup()
                                                                .addComponent(FindEmployeeLabel)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                                .addComponent(saveButton)))))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(54, 54, 54)
                                .addComponent(partTimeEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(fullTimeEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(ConductSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 201, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(27, 27, 27)
                                                .addComponent(RemoveEmployeeButton)
                                                .addGap(191, 191, 191))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addComponent(seeTableButton)
                                                .addGap(354, 354, 354))))
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(25, 25, 25)
                                                .addComponent(FindEmployeeLabel))
                                        .addGroup(layout.createSequentialGroup()
                                                .addContainerGap()
                                                .addComponent(saveButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(WelcomeLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EmployeeNumberLabel)
                                        .addComponent(EmployeeNumberInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(EmployeeNameLabel)
                                        .addComponent(FirstNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(LastNameInputField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeGenderLabel)
                                        .addComponent(maleRadioButton)
                                        .addComponent(femaleRadioButton)
                                        .addComponent(otherGenderRadioButton))
                                .addGap(4, 4, 4)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(employeeWorkLocationLabel)
                                        .addComponent(workLocationInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(deductionRateInput, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(employeeDeductionRateLabel, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(19, 19, 19)
                                                .addComponent(partTimeEmployeeRadioButton))
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, 18)
                                                .addComponent(fullTimeEmployeeRadioButton)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(partTimeEmployeePanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(fullTimeEmployeePanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(seeTableButton)
                                .addGap(14, 14, 14)
                                .addComponent(EmployeeTabbedPane, javax.swing.GroupLayout.PREFERRED_SIZE, 161, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(ConductSearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(RemoveEmployeeButton))
                                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void partTimeEmployeeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_partTimeEmployeeRadioButtonActionPerformed
        // TODO add your handling code here:
        fullTimeEmployeePanel.setVisible(false);
        partTimeEmployeePanel.setVisible(true);
    }//GEN-LAST:event_partTimeEmployeeRadioButtonActionPerformed

    private void fullTimeEmployeeRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fullTimeEmployeeRadioButtonActionPerformed
        // TODO add your handling code here:
        partTimeEmployeePanel.setVisible(false);
        fullTimeEmployeePanel.setVisible(true);

    }//GEN-LAST:event_fullTimeEmployeeRadioButtonActionPerformed

    private void FirstNameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FirstNameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_FirstNameInputFieldActionPerformed

    private void LastNameInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_LastNameInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_LastNameInputFieldActionPerformed

    private void maleRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_maleRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_maleRadioButtonActionPerformed

    private void ConductSearchButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConductSearchButtonActionPerformed
        // TODO add your handling code here:

        //Find Match Functionality
        findMatch();


        EmployeeNumberInputField.setText("");





    }//GEN-LAST:event_ConductSearchButtonActionPerformed

    private void hourlyWageInputActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_hourlyWageInputActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_hourlyWageInputActionPerformed

    private void seeTableButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_seeTableButtonActionPerformed
        // TODO add your handling code here:
        generateTable();
    }//GEN-LAST:event_seeTableButtonActionPerformed

    private void EmployeeNumberInputFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EmployeeNumberInputFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_EmployeeNumberInputFieldActionPerformed

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveButtonActionPerformed
        // TODO add your handling code here:

        if (saveButton.getText().equals("CONFIRM")){
            hashTable.saveToFile();
            saveButton.setText("SAVE");
            System.out.println("Saved to file.");
        }
        else if(saveButton.getText().equals("SAVE")){
            saveButton.setText("CONFIRM");
        }

    }//GEN-LAST:event_saveButtonActionPerformed

    private void RemoveEmployeeButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_RemoveEmployeeButtonActionPerformed
        // TODO add your handling code here:
        removeMatch();
        generateTable();

    }//GEN-LAST:event_RemoveEmployeeButtonActionPerformed


    public void removeMatch(){
        int empNum = Integer.valueOf(EmployeeNumberInputField.getText());
        EmployeeInfo employee = hashTable.findEmployee(empNum);
        hashTable.removeEmployee(employee.getEmployeeNumber());

    }


    public void findMatch(){
        int empNum = Integer.valueOf(EmployeeNumberInputField.getText());

        int number = hashTable.getNumBuckets();

        DefaultTableModel model_2 = (DefaultTableModel) partTimeEmployeeTable.getModel();
        DefaultTableModel model_1 = (DefaultTableModel) fullTimeEmployeeTable.getModel();

        model_1.setRowCount(0);
        model_2.setRowCount(0);

        try{
            EmployeeInfo employee = hashTable.findEmployee(empNum);

            if (employee instanceof FullTimeEmployee){
                FullTimeEmployee emp = (FullTimeEmployee) employee;

                String gender = "";
                switch(emp.getGender()){
                    case 0:
                        gender = "Male";
                        break;

                    case 1:
                        gender = "Female";
                        break;

                    default:
                        gender = "Other";
                        break;
                }

                String workLocation = "";
                switch(employee.getWorkLocation())
                {
                    case 0:
                        workLocation = "Other";
                        break;

                    case 1:
                        workLocation = "Toronto";
                        break;

                    case 2:
                        workLocation = "Mississauga";
                        break;

                    case 3:
                        workLocation = "New York";
                        break;
                }


                model_1.addRow(new Object[]{emp.getEmployeeNumber() , emp.getFirstName(), emp.getLastName(),
                        gender, workLocation, emp.getDeductionRate(),emp.getAnnualSalary() });
            }
            else if (employee instanceof FullTimeEmployee){
                FullTimeEmployee emp = (FullTimeEmployee) employee;

                String gender = "";
                switch(emp.getGender()){
                    case 0:
                        gender = "Male";
                        break;

                    case 1:
                        gender = "Female";
                        break;

                    default:
                        gender = "Other";
                        break;
                }

                String workLocation = "";
                switch(employee.getWorkLocation())
                {
                    case 0:
                        workLocation = "Other";
                        break;

                    case 1:
                        workLocation = "Toronto";
                        break;

                    case 2:
                        workLocation = "Mississauga";
                        break;

                    case 3:
                        workLocation = "New York";
                        break;
                }

                model_2.addRow(new Object[]{emp.getEmployeeNumber(), emp.getFirstName(), emp.getLastName(),
                        gender, workLocation, emp.getDeductionRate(), emp.getHourlyWage(), emp.getHoursPerWeek(), emp.getWeeksPerYear() });
            }
        }

        catch(Exception e){
            System.out.println("Something went wrong, it was: " + e);
        }

    }


    public void generateTable(){
        int number = hashTable.getNumBuckets();

        DefaultTableModel model_2 = (DefaultTableModel) partTimeEmployeeTable.getModel();

        DefaultTableModel model_1 = (DefaultTableModel) fullTimeEmployeeTable.getModel();


        int numInFullTime = 1;
        int numInPartTime = 1;
        model_1.setRowCount(0);
        model_2.setRowCount(0);

        for(int x = 0; x< (number); x++){
            for(int i = 0; i < hashTable.buckets[x].size(); i++)
            {
                EmployeeInfo employee = hashTable.buckets[x].get(i);

                String gender = "";
                switch(employee.getGender()){
                    case 0:
                        gender = "Male";
                        break;

                    case 1:
                        gender = "Female";
                        break;

                    default:
                        gender = "Other";
                        break;

                }


                String workLocation = "";
                switch(employee.getWorkLocation())
                {
                    case 0:
                        workLocation = "Other";
                        break;

                    case 1:
                        workLocation = "Toronto";
                        break;

                    case 2:
                        workLocation = "Mississauga";
                        break;

                    case 3:
                        workLocation = "New York";
                        break;
                }

                if (employee instanceof FullTimeEmployee){
                    FullTimeEmployee emp = (FullTimeEmployee) employee;


                    model_1.addRow(new Object[]{emp.getEmployeeNumber() , emp.getFirstName(), emp.getLastName(),
                            gender, workLocation, emp.getDeductionRate(),emp.getAnnualSalary() });
                }

                else if (employee instanceof FullTimeEmployee){
                    FullTimeEmployee emp = (FullTimeEmployee) employee;

                    model_2.addRow(new Object[]{emp.getEmployeeNumber(), emp.getFirstName(), emp.getLastName(),
                            gender, workLocation, emp.getDeductionRate(), emp.getHourlyWage(), emp.getHoursPerWeek(), emp.getWeeksPerYear() });

                }
            }
        }
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
            java.util.logging.Logger.getLogger(FindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FindEmployee.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FindEmployee().setVisible(true);


            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ConductSearchButton;
    private javax.swing.JLabel EmployeeNameLabel;
    private javax.swing.JTextField EmployeeNumberInputField;
    private javax.swing.JLabel EmployeeNumberLabel;
    private javax.swing.JTabbedPane EmployeeTabbedPane;
    private javax.swing.JLabel FindEmployeeLabel;
    private javax.swing.JTextField FirstNameInputField;
    private javax.swing.JTextField LastNameInputField;
    private javax.swing.JButton RemoveEmployeeButton;
    private javax.swing.JLabel WelcomeLabel;
    private javax.swing.JTextField annualSalaryInput;
    private javax.swing.JLabel annualSalaryLabel;
    private javax.swing.JTextField deductionRateInput;
    private javax.swing.JLabel employeeDeductionRateLabel;
    private javax.swing.JLabel employeeGenderLabel;
    private javax.swing.ButtonGroup employeeTypeButtonGroup;
    private javax.swing.JLabel employeeWorkLocationLabel;
    private javax.swing.JRadioButton femaleRadioButton;
    private javax.swing.JScrollPane fullTimeEmployeePane;
    private javax.swing.JPanel fullTimeEmployeePanel;
    private javax.swing.JRadioButton fullTimeEmployeeRadioButton;
    private javax.swing.JTable fullTimeEmployeeTable;
    private javax.swing.ButtonGroup genderButtonGroup;
    private javax.swing.JTextField hourlyWageInput;
    private javax.swing.JLabel hourlyWageLabel;
    private javax.swing.JTextField hoursPerWeekInput;
    private javax.swing.JLabel hoursPerWeekLabel;
    private javax.swing.JRadioButton maleRadioButton;
    private javax.swing.JRadioButton otherGenderRadioButton;
    private javax.swing.JScrollPane partTimeEmployeePane;
    private javax.swing.JPanel partTimeEmployeePanel;
    private javax.swing.JRadioButton partTimeEmployeeRadioButton;
    private javax.swing.JTable partTimeEmployeeTable;
    private javax.swing.JButton saveButton;
    private javax.swing.JButton seeTableButton;
    private javax.swing.JTextField weeksPerYearInput;
    private javax.swing.JLabel weeksPerYearLabel;
    private javax.swing.JComboBox<String> workLocationInput;
}
