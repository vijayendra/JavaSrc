(custom-set-variables
 '(jde-sourcepath (quote ("/home/egnyte/src")))
 '(jde-build-classpath (quote ("/home/egnyte/src/target/classes")))
 '(jde-global-classpath (quote ("/home/egnyte/src/target/classes")))
 )
(jde-project-file-version "1.0")
(jde-set-variables
 ;'(jde-jdk-registry (quote (("1.6" . "$JAVA_HOME"))))
 '(jde-jdk (quote ("1.6")))
 '(jde-jdk-doc-url "http://download.oracle.com/javase/6/docs/api")
 '(jde-enable-abbrev-mode nil)
 '(jde-gen-k&r t)
 '(jde-gen-cflow-enable t)
 '(jde-complete-function (quote jde-complete-minibuf))
 '(jde-electric-return-p nil)
 '(jde-import-auto-collapse-imports nil)
 '(jde-import-auto-sort t)
 '(jde-import-sorted-groups (quote gor))

 '(jde-project-context-switching-enabled-p t)

 ;; JDE Compile Option Group

 '(jde-compiler (quote ("javac-server" "")))
 '(jde-compile-option-command-line-args nil)
 '(jde-read-compile-args nil)
 '(jde-compile-option-directory "/home/egnyte/src/target/classes")
 '(jde-compile-option-command-line-args nil)
 '(jde-compile-option-sourcepath (quote ("/home/egnyte/src")))
 '(jde-compile-option-debug (quote ("all" (t t t))))
 '(jde-compile-option-deprecation t)
 '(jde-compile-option-debug (quote ("all" (t t t))))
 '(jde-compile-option-optimize nil)
 '(jde-compile-option-depend nil)
 '(jde-compile-option-vm-args nil)
 '(jde-compile-option-verbose t)
 '(jde-compile-option-nowarn nil)

 '(jde-compile-enable-kill-buffer nil)

 ;; JDE Build Option Group

 '(jde-build-function (quote (jde-ant-build)))

 '(jde-ant-invocation-method (quote ("Script")))
 '(jde-ant-home "$ANT_HOME")
 '(jde-ant-user-jar-files "$ANT_CONTRIB")
 '(jde-ant-program "ant")
 '(jde-ant-args "-emacs")
 '(jde-ant-buildfile "build.xml")
 '(jde-ant-read-buildfile nil)
 '(jde-ant-read-target t)
 '(jde-ant-interactive-buildfile "build.xml")
 '(jde-ant-read-args nil)
 '(jde-ant-enable-find t)
 '(jde-ant-complete-target t)

 ;; JDE Run Option Group

 '(jde-run-working-directory ".")
 ;; '(jde-run-application-class "com.example.Main")
 '(jde-run-read-vm-args nil)
 '(jde-run-read-app-args nil)
 '(jde-run-option-verbose (quote (t t t)))
 '(jde-run-option-properties nil)
 ;; '(jde-run-option-heap-size (quote ((1 . "megabytes") (16 . "megabytes"))))
 ;; '(jde-run-option-stack-size (quote ((128 . "kilobytes") (400 . "kilobytes"))))
 ;; '(jde-run-option-garbage-collection (quote (t t)))
 ;; '(jde-run-option-java-profile (quote (t . "./java.prof")))
 ;; '(jde-run-option-heap-profile (quote (t "./java.hprof" 4 20 "Allocation objects")))
 '(jde-run-option-verify (quote (nil t)))
 ;; '(jde-run-option-vm-args (quote ("-Xdebug" "-Xrunjdwp:transport=dt_socket,address=6001,server=y,suspend=n"
 ;;				  "-Xnoagent" "-Djava.compiler=NONE")))
 '(jde-run-option-application-args nil)

 ;; '(jde-run-option-debug (quote ("Server" "Socket" "javadebug" "localhost" "6001" "Yes")))
 
 ;; JDE Debug Option Group

 '(jde-debugger (quote ("jdb")))
 '(jde-db-read-vm-args nil)
 '(jde-db-read-app-args nil)
 '(jde-db-option-application-args nil)
 '(jde-db-option-vm-args nil)
 '(jde-db-option-host nil)
 
 ;; JDE Autocode Option Group

 '(jde-gen-buffer-boilerplate
   (quote ("/**"
 	   " * Describe class here."
	   " *"
	   " * @author vijayendra"
	   " * @verison 1.0"
	   " */")))
 )

;; JDE Cross-Reference Database

;; '(jde-sourcepath (quote ("/home/egnyte/src")))
;; '(jde-global-classpath (quote ("./target/classes" )))
;; '(jde-built-class-path (quote ("./target/classes" )))
;; '(jde-xref-db-base-directory "./xrefdb")
;; '(jde-xref-store-prefixes (quote ("com.example")))
;; '(jde-xref-cache-size 3))

(jde-gen-define-abbrev-template "melse"  '('> "else {" '> 'n '> 'r 'n "}"))

(jde-gen-define-abbrev-template "sysin"  '("System.in.readline();"))
(jde-gen-define-abbrev-template "sysout" '("System.out.println(\"" (p "x:") "\");"))
(jde-gen-define-abbrev-template "syserr" '("System.err.println(\"" (p "x:") "\");"))
(jde-gen-define-abbrev-template "trace"  '("logger.trace(\"" (p "Message:") "\");"))
(jde-gen-define-abbrev-template "debug"  '("logger.debug(\"" (p "Message:") "\");"))
(jde-gen-define-abbrev-template "info"   '("logger.info(\"" (p "Message:") "\");"))
(jde-gen-define-abbrev-template "warn"   '("logger.warn(\"" (p "Message:") "\");"))
(jde-gen-define-abbrev-template "error"  '("logger.error(\"" (p "Message:") "\");"))
(jde-gen-define-abbrev-template "fatal"  '("logger.fatal(\"" (p "Message:") "\");"))

(tempo-define-template "debug"
                       '("if (debug) {" n> "System.out.println(\"" (p "Enter debug message:") "\");" n> "}")
                       "d"
                       "Inserts a print debug message")

(defun flymake-java-ecj-init ()
  (let* ((temp-file   (flymake-init-create-temp-buffer-copy
                       'jde-ecj-create-temp-file))
         (local-file  (file-relative-name
                       temp-file
                       (file-name-directory buffer-file-name))))
    ;; Change your ecj.jar location here

    (list "java" (list "-jar" "/home/egnyte/Development/ecj.jar" "-Xemacs" "-d" "/tmp"
                       "-source" "1.6" "-target" "1.6" 
                       "-proceedOnError"
                       "-classpath" (jde-build-classpath jde-global-classpath)
                       "-sourcepath" (jde-build-classpath jde-sourcepath)
                       local-file))))
 
(defun flymake-java-ecj-cleanup ()
  "Cleanup after `flymake-java-ecj-init' -- delete temp file and dirs."
  (flymake-safe-delete-file flymake-temp-source-file-name)
  (when flymake-temp-source-file-name
    (flymake-safe-delete-directory (file-name-directory flymake-temp-source-file-name))))

(defun jde-ecj-create-temp-file (file-name prefix)
  "Create the file FILE-NAME in a unique directory in the temp directory."
  (file-truename (expand-file-name (file-name-nondirectory file-name)
                                   (expand-file-name  (int-to-string (random)) (flymake-get-temp-dir)))))
 
(push '(".+\\.java$" flymake-java-ecj-init flymake-java-ecj-cleanup) flymake-allowed-file-name-masks)
 
(push '("\\(.*?\\):\\([0-9]+\\): error: \\(.*?\\)\n" 1 2 nil 2 3 (6 compilation-error-face)) compilation-error-regexp-alist)
 
(push '("\\(.*?\\):\\([0-9]+\\): warning: \\(.*?\\)\n" 1 2 nil 1 3 (6 compilation-warning-face)) compilation-error-regexp-alist)

;; Sets the basic indentation for Java source files
;; to two spaces.
(defun my-jde-mode-hook ()
  "Hook for running java file..."
  (message " Loading my-jde-mode-hook...")
  (c-set-offset 'substatement-open 0)
  (c-set-offset 'statement-case-open 0)
  (c-set-offset 'case-label '+)
 (wisent-java-default-setup)
 (flymake-mode)
)

(add-hook 'jde-mode-hook 'my-jde-mode-hook)
